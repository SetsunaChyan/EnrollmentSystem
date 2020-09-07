<template>
    <el-container style="height: 500px; border: 1px solid #eee">
        <el-header style="text-align: right;text-color:white;font-size: 12px;background-color: #409EFF">
            <el-button type="primary" icon="el-icon-edit" @click.native.prevent="addschool()"></el-button>
            <span >你好，管理员</span>
        </el-header>

        <el-container>
            <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
                <el-menu
                        :default-active="$route.path"
                        class="el-menu-vertical-demo"
                        @select="handleSelect"
                        active-text-color="#409EFF"
                        router>
                    <el-menu-item index="/Admin_main"><i class="el-icon-s-custom"></i>管理员主页</el-menu-item>
                    <template slot="title"> <i class="el-icon-menu"></i>信息管理</template>
                    <el-menu-item index="/ModifyStu">考生信息</el-menu-item>
<!--                    <el-menu-item index="/ApproveSch">学校审批</el-menu-item>-->
                    <el-menu-item index="/ModifySch">学校增删</el-menu-item>
                    <el-menu-item index="/Begin">开始录取</el-menu-item>
                    <el-menu-item index="/Admin">人员管理</el-menu-item>
                </el-menu>
            </el-aside>

            <el-main style="width: 75%" >
                <el-table
                        :data="tableData4"
                        style="width: 100%"
                        max-height="1000">
                    <el-table-column label="id">
                        <template slot-scope="scope">
                            <el-input placeholder="请输入内容" v-show="scope.row.show" v-model="scope.row.id"></el-input>
                            <span v-show="!scope.row.show">{{scope.row.id}}</span>
                        </template>
                    </el-table-column>
                    <el-table-column label="校名">
                        <template slot-scope="scope">
                            <el-input placeholder="请输入内容" v-show="scope.row.show" v-model="scope.row.name"></el-input>
                            <span v-show="!scope.row.show">{{scope.row.name}}</span>
                        </template>
                    </el-table-column>
                    <el-table-column label="地址">
                        <template slot-scope="scope">
                            <el-input placeholder="请输入内容" v-show="scope.row.show" v-model="scope.row.address"></el-input>
                            <span v-show="!scope.row.show">{{scope.row.address}}</span>
                        </template>
                    </el-table-column>
                    <el-table-column label="账号">
                        <template slot-scope="scope">
                            <el-input placeholder="请输入内容" v-show="scope.row.show" v-model="scope.row.admin"></el-input>
                            <span v-show="!scope.row.show">{{scope.row.admin}}</span>
                        </template>
                    </el-table-column>
                    <el-table-column label="密码">
                        <template slot-scope="scope">
                            <el-input placeholder="请输入内容" v-show="scope.row.show" v-model="scope.row.pass"></el-input>
                            <span v-show="!scope.row.show">{{scope.row.pass}}</span>
                        </template>
                    </el-table-column>

                    <el-table-column
                            fixed="right"
                            label="操作"
                            >
                        <template slot-scope="scope">
                            <el-button
                                    @click.native.prevent="deleteRow(scope.$index, tableData4)"
                                    type="text"
                                    size="small">
                                移除
                            </el-button>
                            <el-button @click="scope.row.show =true"
                                       type="text"
                                       size="small"
                            >编辑</el-button>
                            <el-button @click="scope.row.show =false"
                                       type="text"
                                       size="small"
                            >保存</el-button>
                        </template>
                    </el-table-column>
                </el-table>
            </el-main>
        </el-container>
    </el-container>
</template>

<script>
    export default {
        methods: {
            deleteRow(index, rows) {
                rows.splice(index, 1);
            },
            addschool(){

            }
        },
        data() {
            return {
                tableData4: [{
                    id: 1,
                    name: '上海理工大学',
                    address: '军工路516',
                    admin: '123',
                    pass: '123',
                    show:false
                }, {
                    id: 2,
                    name: '复旦大学',
                    address: '邯郸路',
                    admin: '123',
                    pass: '123',
                    show:false
                }]
            }
        }
    }
</script>

<style scoped>

</style>