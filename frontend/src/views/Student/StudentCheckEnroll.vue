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

        <el-main style="width: 50%" >
            <p>恭喜你已经被录取</p>
            <p>请等待</p>
        </el-main>
            </el-container>
        </el-container>
    </div>

</template>

<script>
    export default {
        name: "StudentCheckEnroll"
    }
</script>

<style scoped>

</style>