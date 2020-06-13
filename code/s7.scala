  val q3 = select[ModelA] where ModelA.name === "cctv" and (
    ModelA.seq === 1 or ModelA.name === "cctv" or ModelA.name[String].isNull
      or ModelA.seq[Int] > 1 or ModelA.name === "asdf"
    ) limit 3 offset 0 orderBy ModelA.name[String].desc


  Assert.assertEquals(1, q3.size)
