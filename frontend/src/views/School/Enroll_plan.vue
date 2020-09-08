<template>
    <el-container style="height: 500px; border: 1px solid #eee">
        <el-header style="text-align: right;text-color:white;font-size: 12px;background-color: #409EFF">
            <span >你好</span>
        </el-header>

        <el-container>
            <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
                <el-menu
                        :default-active="$route.path"
                        class="el-menu-vertical-demo"
                        @select="handleSelect"
                        active-text-color="#409EFF"
                        router>
                    <el-menu-item index="/School_main"><i class="el-icon-s-custom"></i>院校主页</el-menu-item>
                    <template slot="title"> <i class="el-icon-menu"></i>信息管理</template>
<!--                    <el-menu-item index="/SchoolInfo"><i class="el-icon-edit-outline"></i>学校上报</el-menu-item>-->
                    <el-menu-item index="/Enroll_plan"><i class="el-icon-tickets"></i>招生计划</el-menu-item>
                    <el-submenu index="2">
                        <template slot="title"> <i class="el-icon-menu"></i>录取管理</template>
                        <el-menu-item index="/Admit1">统招录取</el-menu-item>
                        <el-menu-item index="/Admit2">调招录取</el-menu-item>
                        <el-menu-item index="/Admit3">特招录取</el-menu-item>
                        <el-menu-item index="/Admit4">补录录取</el-menu-item>
                    </el-submenu>
<!--                    <el-menu-item index="/checkStu"><i class="el-icon-search"></i>查看录取</el-menu-item>-->
<!--                    <el-menu-item index="/People_mange"><i class="el-icon-info"></i>人员管理</el-menu-item>-->
                </el-menu>
            </el-aside>

            <el-main style="width: 75%" >

                <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
                    <el-form-item label="ID" prop="id" align="left">
                        <el-input v-model="ruleForm.id"></el-input>
                    </el-form-item>
                    <el-form-item label="学校名称" prop="name" align="left">
                        <el-input v-model="ruleForm.name"></el-input>
                    </el-form-item>
                    <el-form-item label="省份" prop="province" align="left">
                        <el-input v-model="ruleForm.provice"></el-input>
                    </el-form-item>
                    <el-form-item label="专业" prop="major" align="left">
                        <el-input v-model="ruleForm.major"></el-input>
                    </el-form-item>
                    <el-form-item label="人数" prop="number" align="left">
                        <el-input v-model="ruleForm.number"></el-input>
                    </el-form-item>

                    <el-form-item label="录取批次" prop="batch" align="left">
                        <el-radio-group v-model="ruleForm.batch">
                            <el-radio label="统招"></el-radio>
                            <el-radio label="特招"></el-radio>
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
</template>


<script>
    export default {
        data() {
            return {
                ruleForm: {
                    id: '',
                    name: '',
                    province:'',
                    major:'',
                    number:'',
                    batch: '',
                },
                rules: {
                    name: [
                        { required: true, message: '请输入校名', trigger: 'blur' },
                    ],
                    id: [
                        { required: true, message: '请输入id', trigger: 'blur' },
                    ],
                    province: [
                        { required: true, message: '请输入省份', trigger: 'blur' },
                    ],
                    major: [
                        { required: true, message: '请输入专业', trigger: 'blur' },
                    ],
                    number: [
                        { required: true, message: '请输入人数', trigger: 'blur' },
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