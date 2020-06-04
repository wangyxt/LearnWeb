
var {add1} = require("./model01")
var Vue = require("./vue.min")

var VM = new Vue({
    el:'#app',
    data:{
        name:'测试vue',
        num1:0,
        num2:0,
        result:0,
    },
    methods:{
        change:function () {
            // this.result = add1(Number.parseInt(this.num1),Number.parseInt(this.num2));
            alert(this.result)
        }
    }
})