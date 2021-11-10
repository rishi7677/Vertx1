package com.example.deployVerticle;

import com.example.vertxDummy.DummyVerticle;

import io.vertx.core.Vertx;

public class DeployDummyVerticle {
	public static void main(String[] args) {
		Vertx vertx = Vertx.vertx();
		DummyVerticle dv= new DummyVerticle();
		vertx.deployVerticle(dv);
	}

}
