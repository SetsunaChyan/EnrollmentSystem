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
                    <el-menu-item index="/ApproveSch">计划审批</el-menu-item>
                    <el-menu-item index="/ModifySch">学校增删</el-menu-item>
                    <el-menu-item index="/Begin">开始录取</el-menu-item>
                    <el-menu-item index="/Admin">人员管理</el-menu-item>
                </el-menu>
            </el-aside>

            <el-main style="width: 75%" >
                <br><br>
                是否开始录取流程
                <br><br>
                <el-button type="primary">开始</el-button>
            </el-main>
        </el-container>
    </el-container>
</template>

<script>

</script>

<style scoped>

</style>