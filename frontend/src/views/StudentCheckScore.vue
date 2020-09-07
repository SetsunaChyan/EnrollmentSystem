<template>
    <div>
        <el-container style="height: 500px; border: 1px solid #eee">
            <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
            <el-menu
                    :default-active="$route.path"
                    class="el-menu-vertical-demo"
                    @select="handleSelect"
                    active-text-color="#409EFF"
                    router>
                <el-menu-item index="/about"><i class="el-icon-s-custom"></i>我的信息</el-menu-item>
                <el-submenu index="2">
                    <template slot="title"> <i class="el-icon-menu"></i>信息管理</template>
                    <el-menu-item index="/StudentCheckScore">查看成绩</el-menu-item>
                    <el-menu-item index="/StudentCheckEnroll">查看录取结果</el-menu-item>
                    <el-menu-item index="/StudentChangePass">修改密码</el-menu-item>
                </el-submenu>
                <el-menu-item index="/Set_Volunteer"><i class="el-icon-document"></i>填报志愿</el-menu-item>
            </el-menu>
        </el-aside>
        <el-container>

        <el-main style="width: 75%" >
            <el-table
                    :data="tableData"
                    stripe
                    style="width: 100%">
                <el-table-column
                        prop="name"
                        label="内容"
                        width="180">
                </el-table-column>
                <el-table-column
                        prop="score"
                        label="分数"
                        width="180">
                </el-table-column>
            </el-table>
        </el-main>
        </el-container>
        </el-container>
    </div>

</template>

<script>
    export default {
        name: "StudentCheckScore",
        data() {
            return {
                tableData: [{
                    name: '语文',
                    score: '120',
                }, {
                    name: '数学',
                    score: '120',
                }, {
                    name: '英语',
                    score: '120',
                }, {
                    name: '总分',
                    score: '360',
                }, {
                    name: '排名',
                    score: '999',
                }]
            }
        }
    }
</script>

<style scoped>

</style>