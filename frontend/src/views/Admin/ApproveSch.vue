<template>
    <el-container style="height: 500px; border: 1px solid #eee">
        <el-header style="text-align: right;text-color:white;font-size: 12px;background-color: #409EFF">
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
                    <el-menu-item index="/ApproveSch">学校审批</el-menu-item>
                    <el-menu-item index="/ModifySch">学校增删</el-menu-item>
                    <el-menu-item index="/Admin">人员管理</el-menu-item>
                </el-menu>
            </el-aside>

            <el-main style="width: 75%" >
                <el-table
                        :data="tableData4"
                        style="width: 100%"
                        max-height="1000">
                    <el-table-column
                            fixed
                            prop="id"
                            label="id">
                    </el-table-column>
                    <el-table-column
                            prop="name"
                            label="校名">
                    </el-table-column>
                    <el-table-column
                            prop="address"
                            label="地址">
                    </el-table-column>
                    <el-table-column
                            fixed="right"
                            label="操作">
                        <template slot-scope="scope">
                            <el-button
                                @click.native.prevent="agreeRow(scope.$index, tableData4)"
                                type="text"
                                size="small">
                               通过
                            </el-button>
                            <el-button
                                    @click.native.prevent="unagreeRow(scope.$index, tableData4)"
                                    type="text"
                                    size="small">
                                未通过
                            </el-button>
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
            agreeRow(index, rows) {
                rows.splice(index, 1);
            },
            unagreeRow(index, rows) {
                rows.splice(index, 1);
            }
        },
        data() {
            return {
                tableData4: [{
                    id: 1,
                    name: '上海理工大学',
                    address: '军工路516'
                }, {
                    id: 2,
                    name: '复旦大学',
                    address: '邯郸路'
                }]
            }
        }
    }
</script>

<style scoped>

</style>