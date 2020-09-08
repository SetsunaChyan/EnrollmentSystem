<template>
    <div>
        <el-container style="height: 500px; border: 1px solid #eee">
            <el-header style="text-align: right;text-color:white;font-size: 12px;background-color: #409EFF">
                <span >你好，考生</span>
            </el-header>


        <el-container>
            <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
                <el-menu
                        :default-active="$route.path"
                        class="el-menu-vertical-demo"
                        @select="handleSelect"
                        active-text-color="#409EFF"
                        router>
                    <el-menu-item index="/StudentMenu"><i class="el-icon-s-custom"></i>我的信息</el-menu-item>
                    <el-submenu index="2">
                        <template slot="title"> <i class="el-icon-menu"></i>信息管理</template>
                        <el-menu-item index="/StudentCheckScore">查看成绩</el-menu-item>
                        <el-menu-item index="/StudentCheckEnroll">查看录取结果</el-menu-item>
                        <el-menu-item index="/StudentChangePass">修改密码</el-menu-item>
                    </el-submenu>
                    <el-submenu index="3">
                        <template slot="title"> <i class="el-icon-document"></i>填报志愿</template>
                        <el-menu-item index="/Set_Volunteer2">填报提前批</el-menu-item>
                        <el-menu-item index="/Set_Volunteer">填报普通批</el-menu-item>
                    </el-submenu>
                </el-menu>
            </el-aside>

    <el-main style="width: 50%" >
        <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm" >
            <el-form-item label="旧密码" prop="Password">
                <el-input v-model.number="ruleForm.Password"></el-input>
            </el-form-item>
            <el-form-item label="密码" prop="newPass">
                <el-input type="password" v-model="ruleForm.newPass" autocomplete="off" ></el-input>
            </el-form-item>
            <el-form-item label="确认密码" prop="checkPass">
                <el-input type="password" v-model="ruleForm.checkPass" autocomplete="off" ></el-input>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="submitForm('ruleForm')">提交</el-button>
                <el-button @click="resetForm('ruleForm')">重置</el-button>
            </el-form-item>
        </el-form>
    </el-main>
        </el-container>
        </el-container>
    </div>

</template>

<script>
    export default {
        data() {

            var validatePass = (rule, value, callback) => {
                if (value === '') {
                    callback(new Error('请输入密码'));
                } else {
                    if (this.ruleForm.checkPass !== '') {
                        this.$refs.ruleForm.validateField('checkPass');
                    }
                    callback();
                }
            };

            var validatePass2 = (rule, value, callback) => {
                if (value === '') {
                    callback(new Error('请再次输入密码'));
                } else if (value !== this.ruleForm.pass) {
                    callback(new Error('两次输入密码不一致!'));
                } else {
                    callback();
                }
            };

            return {
                ruleForm: {
                    newPass: '',
                    checkPass: '',
                    Password: ''
                },
                rules: {
                    newPass: [
                        { validator: validatePass, trigger: 'blur' }
                    ],
                    checkPass: [
                        { validator: validatePass2, trigger: 'blur' }
                    ],
                }
            };
        },

        methods: {
            submitForm(formName) {
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        alert('submit!');
                    } else {
                        console.log('error submit!!');
                        return false;
                    }
                });
            },
            resetForm(formName) {
                this.$refs[formName].resetFields();
            },
            handleSelect(key, keyPath)
            {
                console.log(key, keyPath);
            }
        }
        }
</script>

<style scoped>

</style>