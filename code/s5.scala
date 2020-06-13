  def onMessage(listener:Consumer[Message]):Wechaty={
    EventEmitter.addListener[EventMessagePayload](PuppetEventName.MESSAGE,listener)
    this
  }

  private[wechaty] implicit def toMessage(messageListener: Consumer[Message])(implicit puppet: PuppetResolver): EventMessagePayload => Unit = {
    messagePayload: EventMessagePayload => { messageListener.accept(new Message(messagePayload.messageId)) }
  }
