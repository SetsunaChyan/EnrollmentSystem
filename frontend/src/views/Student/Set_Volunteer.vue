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
                        <el-menu-item index="/Set_Volunteer"><i class="el-icon-document"></i>填报志愿</el-menu-item>
                    </el-menu>
                </el-aside>

                <el-main style="width: 75%" >

                    <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                        <el-form-item label="姓名" prop="name" align="left">
                            <el-input v-model="ruleForm.name"></el-input>
                        </el-form-item>
                        <el-form-item label="身份证号" prop="cardid" align="left">
                            <el-input v-model="ruleForm.cardid"></el-input>
                        </el-form-item>
                        <el-form-item label="准考证号" prop="testid" align="left">
                            <el-input v-model="ruleForm.testid"></el-input>
                        </el-form-item>
                        <el-form-item label="省份" prop="province" align="left">
                            <el-input v-model="ruleForm.province"></el-input>
                        </el-form-item>
                        <el-form-item label="专业" prop="major" align="left">
                            <el-input v-model="ruleForm.major"></el-input>
                        </el-form-item>
                        <el-form-item label="志愿序号" prop="order" align="left">
                            <el-input v-model="ruleForm.order"></el-input>
                        </el-form-item>

                        <el-form-item label="录取批次" prop="batch" align="left">
                            <el-radio-group v-model="ruleForm.batch">
                                <el-radio label="第一批"></el-radio>
                                <el-radio label="第二批"></el-radio>
                            </el-radio-group>
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
                    name: '',
                    cardid:'',
                    testid:'',
                    province:'',
                    major:'',
                    order:'',
                    batch: '',
                },
                rules: {
                    name: [
                        { required: true, message: '请输入姓名', trigger: 'blur' },
                        { min: 2, max: 5, message: '长度在 2 到 5 个字符', trigger: 'blur' }
                    ],
                    cardid: [
                        { required: true, message: '请输入身份证号', trigger: 'blur' },
                    ],
                    testid: [
                        { required: true, message: '请输入准考证号', trigger: 'blur' },
                    ],
                    province: [
                        { required: true, message: '请输入省份', trigger: 'blur' },
                    ],
                    major: [
                        { required: true, message: '请输入专业', trigger: 'blur' },
                    ],
                    order: [
                        { required: true, message: '请输入专业序号', trigger: 'blur' },
                    ],
                    batch: [
                        { required: true, message: '请选择录取批次', trigger: 'change' }
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