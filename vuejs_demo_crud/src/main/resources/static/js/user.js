var vue = new Vue({

    el:"#abc",
    data:{
        users:{},
        userList:[]
    },
    methods:{
        // 执行ajax操作
        findAll:function () {

            var url = "user/findAll";

            var _this = this;

            axios.get(url).then(function (result) {

                _this.userList = result.data;

            }).catch(function (err) {

                console.log(err);

            });
        },
        findOne:function (id) {

            var url = "user/findOne" + id;

            var _this = this;

            axios.get(url).then(function (result) {

                _this.users = result.data;

            }).catch(function (err) {

                console.log(err);

            });
            $("#myModal").modal("show");
        }

    },
    created:function(){
        this.findAll();
    }

});