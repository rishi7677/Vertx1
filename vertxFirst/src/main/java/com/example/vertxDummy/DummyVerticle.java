package com.example.vertxDummy;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Promise;

public class DummyVerticle extends AbstractVerticle{
	
	@Override
	public void start(Promise<Void> startPromise) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DummyVerticle.start()");
	}

}
