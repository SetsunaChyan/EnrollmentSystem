<template>
    <el-container>
        <el-header><h1>考生录取系统</h1></el-header>
        <el-main>
            <el-row>
                <el-col :span="8" :offset="8" align="center">
                    <div class="grid-content">
                        <el-form ref="form" :model="form" label-width="0px">
                            <el-form-item>
                                <el-input v-model="form.username" placeholder="用户名"
                                          prefix-icon="el-icon-user"></el-input>
                            </el-form-item>
                            <el-form-item>
                                <el-input type="password" v-model="form.password" placeholder="密码" autocomplete="off"
                                          prefix-icon="el-icon-lock"></el-input>
                            </el-form-item>
                            <el-form-item align="left">
                                <el-select v-model="form.character" style="width: 40%;">
                                    <el-option
                                            v-for="item in options"
                                            :key="item.value"
                                            :label="item.label"
                                            :value="item.value">
                                    </el-option>
                                </el-select>
                            </el-form-item>
                            <el-form-item>
                                <el-button type="primary" @click="login">登录</el-button>
                                <el-button>注册</el-button>
                            </el-form-item>
                        </el-form>
                    </div>
                </el-col>
            </el-row>
        </el-main>
    </el-container>
</template>
<script>
    export default {
        data: function () {
            return {
                form: {
                    username: '',
                    password: '',
                    character: 'student'
                },
                options: [{
                    value: 'student',
                    label: '学生'
                }, {
                    value: 'school',
                    label: '院校'
                }, {
                    value: 'admin',
                    label: '管理员'
                }]
            }
        },
        methods: {
            login: function () {
                axios.get('api/user/login', {
                    params: this.form
                }).then(function (ret) {
                    console.log(ret)
                    if (ret.data.status === 0) {
                        window.location.href = "IndexExample";
                    } else {
                        alert(ret.data.msg);
                    }
                }, function () {
                    console.log('传输失败');
                });
            }
        }
    }
</script>

<style>
    .el-header {
        text-align: center;
        line-height: 40px;
    }

    .el-main {
        line-height: 160px;
    }
</style>