import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/about',
        name: 'About',
        component: () => import('../views/About.vue'),
    },
    {
        path: '/StudentMenu',
        name: 'StudentMenu',
        component: () => import('../views/Student/StudentMenu.vue'),
    },
    {
        path: '/StudentChangePass',
        name: 'StudentChangePass',
        component: () => import('../views/Student/StudentChangePass.vue'),
    },
    {
        path: '/StudentCheckEnroll',
        name: 'StudentCheckEnroll',
        component: () => import('../views/Student/StudentCheckEnroll.vue'),
    },
    {
        path: '/StudentCheckScore',
        name: 'StudentCheckScore',
        component: () => import('../views/Student/StudentCheckScore.vue'),
    },
    {
        path: '/Set_Volunteer',
        name: 'Set_Volunteer',
        component: () => import('../views/Student/Set_Volunteer.vue'),
    },



    {
        path: '/School_main',
        name: 'School_main',
        component: () => import('../views/School/School_main.vue'),
    },
    {
        path: '/SchoolInfo',
        name: 'SchoolInfo',
        component: () => import('../views/School/SchoolInfo.vue'),
    },
    {
        path: '/Enroll_plan',
        name: 'Enroll_plan',
        component: () => import('../views/School/Enroll_plan.vue'),
    },
    {
        path: '/Admit1',
        name: 'Admit1',
        component: () => import('../views/School/Admit1.vue'),
    },
    {
        path: '/Admit2',
        name: 'Admit2',
        component: () => import('../views/School/Admit2.vue'),
    },
    {
        path: '/Admit3',
        name: 'Admit3',
        component: () => import('../views/School/Admit3.vue'),
    },
    {
        path: '/Admit4',
        name: 'Admit4',
        component: () => import('../views/School/Admit4.vue'),
    },
    {
        path: '/checkStu',
        name: 'checkStu',
        component: () => import('../views/School/checkStu.vue'),
    },
    {
        path: '/People_mange',
        name: 'People_mange',
        component: () => import('../views/School/People_mange.vue'),
    },


    {
        path: '/Admin_main',
        name: 'Admin_main',
        component: () => import('../views/Admin/Admin_main.vue'),
    },
    {
        path: '/ApproveSch',
        name: 'ApproveSch',
        component: () => import('../views/Admin/ApproveSch.vue'),
    },
    {
        path: '/ModifySch',
        name: 'ModifySch',
        component: () => import('../views/Admin/ModifySch.vue'),
    },
    {
        path: '/ModifyStu',
        name: 'ModifyStu',
        component: () => import('../views/Admin/ModifyStu.vue'),
    },
    {
        path: '/Admin',
        name: 'Admin',
        component: () => import('../views/Admin/Admin.vue'),
    },

    {
        path: '/Login',
        name: 'Login',
        component: () => import('../views/Login.vue')
    }



]

const router = new VueRouter({
    routes
})



export default router
