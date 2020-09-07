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
                    <el-menu-item index="/SchoolInfo"><i class="el-icon-edit-outline"></i>学校上报</el-menu-item>
                    <el-menu-item index="/Enroll_plan"><i class="el-icon-tickets"></i>招生计划</el-menu-item>
                    <el-submenu index="2">
                        <template slot="title"> <i class="el-icon-menu"></i>录取管理</template>
                        <el-menu-item index="/Admit1">统招录取</el-menu-item>
                        <el-menu-item index="/Admit2">调招录取</el-menu-item>
                        <el-menu-item index="/Admit3">特招录取</el-menu-item>
                        <el-menu-item index="/Admit4">补录录取</el-menu-item>
                    </el-submenu>
                    <el-menu-item index="/checkStu"><i class="el-icon-search"></i>查看录取</el-menu-item>
                    <el-menu-item index="/People_mange"><i class="el-icon-info"></i>人员管理</el-menu-item>
                </el-menu>
            </el-aside>

            <el-main style="width: 75%" >

                <el-table
                        :data="tableData5"
                        style="width: 100%">
                    <el-table-column type="expand">
                        <template slot-scope="props">
                            <el-form label-position="left" inline class="demo-table-expand">
                                <el-form-item label="姓名">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.name"></el-input>
                                    <span v-show="!props.row.show">{{props.row.name}}</span>
                                </el-form-item>
                                <el-form-item label="性别">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.sex"></el-input>
                                    <span v-show="!props.row.show">{{props.row.sex}}</span>
                                </el-form-item>
                                <el-form-item label="年龄">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.age"></el-input>
                                    <span v-show="!props.row.show">{{props.row.age}}</span>
                                </el-form-item>
                                <el-form-item label="准考证号">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.id"></el-input>
                                    <span v-show="!props.row.show">{{props.row.id}}</span>
                                </el-form-item>
                                <el-form-item label="身份证号">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.cardId"></el-input>
                                    <span v-show="!props.row.show">{{props.row.cardId}}</span>
                                </el-form-item>
                                <el-form-item label="联系方式">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.phone"></el-input>
                                    <span v-show="!props.row.show">{{props.row.phone}}</span>
                                </el-form-item>
                                <el-form-item label="籍贯">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.address"></el-input>
                                    <span v-show="!props.row.show">{{props.row.address}}</span>
                                </el-form-item>
                            </el-form>
                        </template>
                    </el-table-column>
                    <el-table-column
                            label="准考证号"
                            prop="id">
                    </el-table-column>
                    <el-table-column
                            label="姓名"
                            prop="name">
                    </el-table-column>
                    <el-table-column
                            label="性别"
                            prop="sex">
                    </el-table-column>
                    <el-table-column
                            fixed="right"
                            label="操作"
                    >
                        <template slot-scope="props">
                            <el-button @click="props.row.show =true"
                                       type="text"
                                       size="small"
                            >编辑</el-button>
                            <el-button @click="props.row.show =false"
                                       type="text"
                                       size="small"
                            >保存</el-button>
                            <el-button
                                    @click.native.prevent="deleteRow(props.$index, tableData5)"
                                    type="text"
                                    size="small">
                                移除</el-button>
                        </template>
                    </el-table-column>

                </el-table>


            </el-main>
        </el-container>
    </el-container>
</template>

<style>
    .demo-table-expand {
        font-size: 0;
    }
    .demo-table-expand label {
        width: 90px;
        color: #99a9bf;
    }
    .demo-table-expand .el-form-item {
        margin-right: 0;
        margin-bottom: 0;
        width: 50%;
    }
</style>

<script>
    export default {
        methods: {
            deleteRow(index, rows) {
                rows.splice(index, 1);
            }
        },
        data() {
            return {
                tableData5: [{
                    id: '12987122',
                    name: '张三',
                    cardId: '123456',
                    age: '18',
                    address: '上海',
                    phone: '1521762536',
                    sex: '男',
                    show:false
                }, {
                    id: '12987122',
                    name: '张三',
                    cardId: '123456',
                    age: '18',
                    address: '上海',
                    phone: '1521762536',
                    sex: '男',
                    show:true
                }]
            }
        }
    }
</script>

<style scoped>

</style>