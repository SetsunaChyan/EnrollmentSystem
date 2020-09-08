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

                <el-table
                        :data="tableData5"
                        style="width: 100%">
                    <el-table-column type="expand">
                        <template slot-scope="props">
                            <el-form label-position="left" inline class="demo-table-expand">
                                <el-form-item label="姓名">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.Name"></el-input>
                                    <span v-show="!props.row.show">{{props.row.Name}}</span>
                                </el-form-item>
                                <el-form-item label="学校">
                                <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.School_name"></el-input>
                                <span v-show="!props.row.show">{{props.row.School_name}}</span>
                            </el-form-item>
                                <el-form-item label="学校代码">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.School_ID"></el-input>
                                    <span v-show="!props.row.show">{{props.row.School_ID}}</span>
                                </el-form-item>
                                <el-form-item label="准考证号">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.examinationNumber"></el-input>
                                    <span v-show="!props.row.show">{{props.row.examinationNumber}}</span>
                                </el-form-item>
                                <el-form-item label="身份证号">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.identificationNumber"></el-input>
                                    <span v-show="!props.row.show">{{props.row.identificationNumber}}</span>
                                </el-form-item>
                                <el-form-item label="省份">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.Province"></el-input>
                                    <span v-show="!props.row.show">{{props.row.Province}}</span>
                                </el-form-item>
                                <el-form-item label="专业">
                                <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.Major"></el-input>
                                <span v-show="!props.row.show">{{props.row.Major}}</span>
                            </el-form-item>
                                <el-form-item label="志愿序号">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.Serial_number"></el-input>
                                    <span v-show="!props.row.show">{{props.row.Serial_number}}</span>
                                </el-form-item>
                                <el-form-item label="录取批次">
                                    <el-input placeholder="请输入内容" v-show="props.row.show" v-model="props.row.Batch"></el-input>
                                    <span v-show="!props.row.show">{{props.row.Batch}}</span>
                                </el-form-item>
                            </el-form>
                        </template>
                    </el-table-column>
                    <el-table-column
                            label="准考证号"
                            prop="examinationNumber">
                    </el-table-column>
                    <el-table-column
                            label="姓名"
                            prop="Name">
                    </el-table-column>
                    <el-table-column
                            label="专业"
                            prop=Major>
                    </el-table-column>
<!--                    <el-table-column-->
<!--                            fixed="right"-->
<!--                            label="操作"-->
<!--                    >-->
<!--                        <template slot-scope="props">-->
<!--&lt;!&ndash;                            <el-button @click="props.row.show =true"&ndash;&gt;-->
<!--&lt;!&ndash;                                       type="text"&ndash;&gt;-->
<!--&lt;!&ndash;                                       size="small"&ndash;&gt;-->
<!--&lt;!&ndash;                            >编辑</el-button>&ndash;&gt;-->
<!--&lt;!&ndash;                            <el-button @click="props.row.show =false"&ndash;&gt;-->
<!--&lt;!&ndash;                                       type="text"&ndash;&gt;-->
<!--&lt;!&ndash;                                       size="small"&ndash;&gt;-->
<!--&lt;!&ndash;                            >保存</el-button>&ndash;&gt;-->
<!--                            <el-button-->
<!--                                    @click.native.prevent="deleteRow(props.$index, tableData5)"-->
<!--                                    type="text"-->
<!--                                    size="small">-->
<!--                                移除</el-button>-->
<!--                            <el-button-->
<!--                                    @click.native.prevent="agreeRow(props.$index, tableData5)"-->
<!--                                    type="text"-->
<!--                                    size="small">-->
<!--                                通过</el-button>-->
<!--                        </template>-->
<!--                    </el-table-column>-->

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
        // methods: {
        //     deleteRow(index, rows) {
        //         rows.splice(index, 1);
        //     },
        //     agreeRow(index, rows) {
        //         rows.splice(index, 1);
        //     }
        // },
        data() {
            return {
                tableData5: [{
                    examinationNumber: '12987122',
                    Name: '张三',
                    identificationNumber: '123456',
                    age: '18',
                    Province: '上海',
                    School_name:'上海理工',
                    School_ID:'111',
                    phone: '1521762536',
                    Serial_number: '13134',
                    Batch: '1',
                    Major: '计算机科学与技术',
                    show:false
                }, {
                    examinationNumber: '12987122',
                    Name: '张三',
                    identificationNumber: '123456',
                    age: '18',
                    Province: '上海',
                    School_name:'上海理工',
                    School_ID:'111',
                    phone: '1521762536',
                    Serial_number: '13134',
                    Batch: '1',
                    Major: '计算机科学与技术',
                    show:false
                }]
            }
        }
    }
</script>

<style scoped>

</style>