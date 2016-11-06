def execute(){

    def instance = context.getInstance()
    println("response status:" + instance.response.getStatus())
    message.addField("responseCode", instance.response.getStatus())

}
