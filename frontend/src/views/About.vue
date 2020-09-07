<template>
  <el-header>
    <el-menu
            :default-active="$route.path"
            class="el-menu-demo"
            mode="horizontal"
            @select="handleSelect"
            background-color="#545c64"
            text-color="#fff"
            active-text-color="#ffd04b"
            router>
      <el-menu-item index="/about">处理中心</el-menu-item>
      <el-submenu index="2">
        <template slot="title">我的工作台</template>
        <el-menu-item index="2-1">查看成绩</el-menu-item>
        <el-menu-item index="/StudentCheckEnroll">查看录取结果</el-menu-item>
        <el-menu-item index="/StudentChangePass">修改密码</el-menu-item>
      </el-submenu>
      <el-menu-item index="/Set_Volunteer">填报志愿</el-menu-item>
    </el-menu>
  </el-header>
</template>

<script>
  export default {
    data: function() {
      return {
        activeIndex: '1'
      };
    },
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>

<style scoped>

</style>