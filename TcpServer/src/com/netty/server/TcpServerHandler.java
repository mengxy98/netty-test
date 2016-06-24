package com.netty.server;

import org.apache.log4j.Logger;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TcpServerHandler extends SimpleChannelInboundHandler<Object>{

	private static final Logger logger = Logger.getLogger(TcpServerHandler.class);

	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg)throws Exception {
		   logger.info("server接收消息成功:"+msg);
		   System.out.println("server接收消息成功:"+msg);
		   ctx.channel().writeAndFlush("yes, server is accepted you ,nice !"+msg);  
		
		
		
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		logger.warn("Unexpected exception from downstream.", cause);  
		 System.out.println("Unexpected exception from downstream. cause:"+cause);
		ctx.close();
	}

}
