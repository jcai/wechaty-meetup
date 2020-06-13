    val contactPayloadResponse1 = ContactPayloadResponse.newBuilder()
      .setName("jcai")
      .build()
    stubFor(unaryMethod(PuppetGrpc.getContactPayloadMethod)
      .willReturn(contactPayloadResponse1))

    val contact = new Contact("contactId")
    Assertions.assertEquals("jcai",contact.name)
