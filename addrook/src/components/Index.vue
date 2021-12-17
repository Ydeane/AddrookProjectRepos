<template>
  <div>
    <el-container>
      <el-header class="myheader">Addrook通讯录管理系统</el-header>
      <el-main>
        <el-header>
          <el-row>
            <el-col :span="3"><div class="grid-content bg-purple"></div></el-col>
            <el-col :span="2"><div class="grid-content bg-purple-light">
              <el-button  type="primary" round icon="el-icon-plus" >新增通讯录</el-button>
            </div></el-col>
            <el-col :span="19"><div class="grid-content bg-purple-light"></div></el-col>
          </el-row>
        </el-header>
        <el-main >
          <el-table
            :data="tableData"
            stripe
            style="width: 80%;
                  margin: 0 auto">
            <el-table-column
              prop="no"
              label="序号"
              width="150">
            </el-table-column>
            <el-table-column
              prop="name"
              label="姓名"
              width="180">
            </el-table-column>
            <el-table-column
              prop="cellphone"
              label="手机号码"
              width="180">
            </el-table-column>
            <el-table-column
              prop="address"
              label="地址"
              width="180">
            </el-table-column>
            <el-table-column
              label="操作"
              width="300">
              <template slot-scope="scope">
                <el-button @click="update(scope.row)" type="text" size="small">修改</el-button>
                |
                <el-button type="text" size="small">删除</el-button>
              </template>
            </el-table-column>
          </el-table>
        </el-main>
      </el-main>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "Index",
  methods: {
    update(row) {
      console.log(row);
    }
  },
  data() {
    return {
      tableData: []
    }
  },
  created() {
    this.$axios.post("http://localhost:8888/addrook/page/1/10",{}).then(Resp =>{
      //当请求返回时，执行的代码
      //获得想用的数据
      var code =  Resp.data.code;
      if (code == 20000){
        //获得分页视图列表
        var addrookList = Resp.data.data.list;
        this.tableData = addrookList;

      }
      console.log(Resp.data);

    })
  }
}
</script>


<style scoped>
.myheader{
  background-color: coral;
  font-family: "微软雅黑";
  font-size: 50px;
}

</style>
