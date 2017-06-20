package com.github.adrielsoares.java.spring4.calculadora.rxnetty;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.reactivex.netty.protocol.http.server.HttpServerRequest;
import io.reactivex.netty.protocol.http.server.HttpServerResponse;
import io.reactivex.netty.protocol.http.server.RequestHandler;
import rx.Observable;

/**
 * Created by ilegra0267 on 20/06/17.
 */
public class RxNettyHandler implements RequestHandler<ByteBuf, ByteBuf> {

    private final String calculoUri;
    private final ResourceCalculo resourceCalculo;

    public RxNettyHandler(String calculoUri, ResourceCalculo resourceCalculo) {
        this.calculoUri = calculoUri;
        this.resourceCalculo = resourceCalculo;
    }

    @Override
    public Observable<Void> handle(HttpServerRequest<ByteBuf> request, HttpServerResponse<ByteBuf> response) {
        if (request.getUri().startsWith(calculoUri)) {
            response.setStatus(HttpResponseStatus.OK);
            return response.writeStringAndFlush(ResourceCalculo.historico());
        } else {
            response.setStatus(HttpResponseStatus.NOT_FOUND);
            return response.close();
        }
    }
}