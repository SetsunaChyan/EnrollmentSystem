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


                        <el-form-item label="学校3" prop="name3" align="left">
                            <el-input v-model="ruleForm.name3"></el-input>
                        </el-form-item>
                        <el-form-item label="专业3-1" prop="major31" align="left">
                            <el-input v-model="ruleForm.major31"></el-input>
                        </el-form-item>
                        <el-form-item label="专业3-2" prop="major32" align="left">
                            <el-input v-model="ruleForm.major32"></el-input>
                        </el-form-item>

                        <el-form-item label="学校4" prop="name4" align="left">
                            <el-input v-model="ruleForm.name4"></el-input>
                        </el-form-item>
                        <el-form-item label="专业4-1" prop="major41" align="left">
                            <el-input v-model="ruleForm.major41"></el-input>
                        </el-form-item>
                        <el-form-item label="专业4-2" prop="major42" align="left">
                            <el-input v-model="ruleForm.major42"></el-input>
                        </el-form-item>

                        <el-form-item label="学校5" prop="name5" align="left">
                            <el-input v-model="ruleForm.name5"></el-input>
                        </el-form-item>
                        <el-form-item label="专业5-1" prop="major51" align="left">
                            <el-input v-model="ruleForm.major51"></el-input>
                        </el-form-item>
                        <el-form-item label="专业5-2" prop="major52" align="left">
                            <el-input v-model="ruleForm.major52"></el-input>
                        </el-form-item>

                        <el-form-item label="学校6" prop="name6" align="left">
                            <el-input v-model="ruleForm.name6"></el-input>
                        </el-form-item>
                        <el-form-item label="专业6-1" prop="major61" align="left">
                            <el-input v-model="ruleForm.major61"></el-input>
                        </el-form-item>
                        <el-form-item label="专业6-2" prop="major62" align="left">
                            <el-input v-model="ruleForm.major62"></el-input>
                        </el-form-item>

                        <el-form-item label="服从调剂"  align="left">
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
                    name3: '',
                    major31:'',
                    major32:'',
                    name4: '',
                    major41:'',
                    major42:'',
                    name5: '',
                    major51:'',
                    major52:'',
                    name6: '',
                    major61:'',
                    major62:'',
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
                    ],
                    name3: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major31: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major32: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    name4: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major41: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major42: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    name5: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major51: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major52: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    name6: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major61: [
                        { required: true, message: '请输入', trigger: 'blur' },
                    ],
                    major62: [
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