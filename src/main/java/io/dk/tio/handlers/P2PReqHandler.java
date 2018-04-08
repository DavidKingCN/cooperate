package io.dk.tio.handlers;

import java.nio.ByteBuffer;
import java.util.Date;

import org.tio.core.Aio;
import org.tio.core.ChannelContext;
//import org.tio.json.Json;

import io.dk.tio.body.P2PReqBody;
import io.dk.tio.server.BarrageHandlerIntf;
import io.dk.tio.server.BarragePacket;
import io.dk.tio.server.BarrageSessionContext;
import io.dk.tio.server.Type;

public class P2PReqHandler implements BarrageHandlerIntf<P2PReqBody>{

	@Override
	public Object handler(
			BarragePacket packet,
			String jsonStr,
			ChannelContext<BarrageSessionContext, BarragePacket, Object> channelContext)
			throws Exception {
		System.out.println(jsonStr);
		BarragePacket barragePacket = new BarragePacket((new Date().toString()+jsonStr).getBytes(BarragePacket.CHARSET));
		Aio.send(channelContext, barragePacket);
		return null;
	}

}
