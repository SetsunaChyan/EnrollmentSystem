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
        component: () => import('../views/StudentMenu.vue'),
    },
    {
        path: '/StudentChangePass',
        name: 'StudentChangePass',
        component: () => import('../views/StudentChangePass.vue'),
    },
    {
        path: '/StudentCheckEnroll',
        name: 'StudentCheckEnroll',
        component: () => import('../views/StudentCheckEnroll.vue'),
    },
    {
        path: '/StudentCheckScore',
        name: 'StudentCheckScore',
        component: () => import('../views/StudentCheckScore.vue'),
    },
    {
        path: '/Set_Volunteer',
        name: 'Set_Volunteer',
        component: () => import('../views/Set_Volunteer.vue'),
    },

    {
        path: '/School_main',
        name: 'School_main',
        component: () => import('../views/School_main.vue'),
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
