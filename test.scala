val example: RDD[LabeledPoint] = MLUtils.loadLibSVMFile(sc, "file1.txt")
val data: RDD[String] = examples.map(point => point.label)