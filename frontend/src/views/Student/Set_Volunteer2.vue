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

                <el-main style="width: 75%" >

                    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                        <el-form-item label="学校1" prop="name1" align="left">
                            <el-input v-model="ruleForm.name1"></el-input>
                        </el-form-item>
                        <el-form-item label="专业1-1" prop="major11" align="left">
                            <el-input v-model="ruleForm.major11"></el-input>
                        </el-form-item>
                        <el-form-item label="专业1-2" prop="major12" align="left">
                            <el-input v-model="ruleForm.major12"></el-input>
                        </el-form-item>

                        <el-form-item label="学校2" prop="name2" align="left">
                            <el-input v-model="ruleForm.name1"></el-input>
                        </el-form-item>
                        <el-form-item label="专业2-1" prop="major21" align="left">
                            <el-input v-model="ruleForm.major11"></el-input>
                        </el-form-item>
                        <el-form-item label="专业2-2" prop="major22" align="left">
                            <el-input v-model="ruleForm.major12"></el-input>
                        </el-form-item>

                        <el-form-item label="服从调剂" align="left">
                            <el-switch v-model="ruleForm.delivery"></el-switch>
                        </el-form-item>


                        <el-form-item>
                            <el-button type="primary" @click="submitForm('ruleForm')">立即创建</el-button>
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
            return {
                ruleForm: {
                    name1: '',
                    major11:'',
                    major12:'',
                    name2: '',
                    major21:'',
                    major22:'',
                    delivery: false,
                },
                rules: {
                    name1: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major11: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major12: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    name2: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major21: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major22: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ]
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
            }
        }
    }
</script>

<style scoped>

</style>