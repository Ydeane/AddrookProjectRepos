// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
//引入ElementUI功能
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
//在此处引入Axios，那么Axios功能就相当于是全局引入，那么其他组件就能够用到Axios机制，
//就不需要在每个单独的组件中引入
import axios from "axios";

Vue.config.productionTip = false
Vue.use(ElementUI);
//需要将引入的axios添加到vue属性中，那么在其他组件中就可以通过使用高属性来获取axios
Vue.prototype.$axios=axios;
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>',
  render: h => h(App)

})
