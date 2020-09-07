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
                你好，欢迎来到院校管理界面

            </el-main>
        </el-container>
    </el-container>
</template>

<script>
    export default {
        name: "School_main"
    }
</script>

<style scoped>

</style>