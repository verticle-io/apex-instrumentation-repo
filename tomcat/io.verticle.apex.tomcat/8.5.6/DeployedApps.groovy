// A simple groovy script that gets executed on each instrumented method call
def execute(){

    println("method executed")

    def instance = context.getInstance()
    message.addField("deployed", instance.deployed)
    message.addField("serviced", instance.serviced)

    instance.serviced.each{
      println("serviced: ${it.key}")
    }

    instance.deployed.each{
      println("deployed: ${it.key}")
    }

    println("file:" + arg1.toString())
    println("contexts:" + arg2.toString())

}
