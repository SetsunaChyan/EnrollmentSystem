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
                    <el-menu-item index="/about"><i class="el-icon-s-custom"></i>我的信息</el-menu-item>
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
            <el-table
                    :data="tableData"
                    stripe
                    style="width: 100%">
                <el-table-column
                        prop="ExaminationNumber"
                        label="准考证号"
                        >
                </el-table-column>
                <el-table-column
                        prop="name"
                        label="姓名"
                        >
                </el-table-column>
                <el-table-column
                        prop="Chinese_grade"
                        label="语文"
                        >
                </el-table-column>
                <el-table-column
                        prop="Math_grade"
                        label="数学"
                        >
                </el-table-column>
                <el-table-column
                        prop="English_grade"
                        label="英语"
                        >
                </el-table-column>
                <el-table-column
                        prop="Physics_grade"
                        label="物理"
                        >
                </el-table-column>
                <el-table-column
                        prop="Chemistry_grade"
                        label="化学"
                        >
                </el-table-column>
                <el-table-column
                        prop="Biology_grade"
                        label="生物"
                        >
                </el-table-column>
                <el-table-column
                        prop="Total_points"
                        label="总分"
                        >
                </el-table-column>
                <el-table-column
                        prop="Ranking"
                        label="排名"
                        >
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
                dialog_visible: false,
                tableData: [{
                    ExaminationNumber: '31343',
                    name: '张三',
                    Chinese_grade: '120',
                    Math_grade: '120',
                    English_grade: '120',
                    Chemistry_grade: '80',
                    Physics_grade: '80',
                    Biology_grade: '80',
                    Total_points: '600',
                    Ranking: '111',
                }]
            }
        }
    }
</script>

<style scoped>

</style>