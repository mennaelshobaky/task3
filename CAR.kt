abstract class CAR {
    var model: String
        set(model_value) { model = modelvalue }
        get() {return model}
    var color: String
        set(color_value) { color = colorvalue }
        get() {return color}
    var speed: Double
        set(speed_value) {speed = speedvalue}
        get() {return speed}

    abstract fun getfueltype()


}