package io.dk.tio.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
//import org.tio.json.Json;
import org.tio.server.intf.ServerAioListener;

import com.alibaba.fastjson.JSON;

/**
 * @author DavidKing
 * 2017年3月26日 下午8:22:31
 */
public class BarrageServerAioListener implements ServerAioListener<BarrageSessionContext, BarragePacket, Object>
{
	private static Logger log = LoggerFactory.getLogger(BarrageServerAioListener.class);

	/**
	 * 
	 * @authorDavidKing
	 */
	public BarrageServerAioListener()
	{
	}

	/**
	 * @param args
	 * @authorDavidKing
	 */
	public static void main(String[] args)
	{

	}

	/** 
	 * @param channelContext
	 * @param isConnected
	 * @param isReconnect
	 * @throws Exception
	 * @authorDavidKing
	 */
	@Override
	public void onAfterConnected(ChannelContext<BarrageSessionContext, BarragePacket, Object> channelContext, boolean isConnected, boolean isReconnect) throws Exception
	{
		log.info("onAfterConnected channelContext:{}, isConnected:{}, isReconnect:{}", channelContext, isConnected, isReconnect);

		//连接后，需要把连接会话对象设置给channelContext
		channelContext.setSessionContext(new BarrageSessionContext());
	}

	/** 
	 * @param channelContext
	 * @param packet
	 * @param isSentSuccess
	 * @throws Exception
	 * @authorDavidKing
	 */
	@Override
	public void onAfterSent(ChannelContext<BarrageSessionContext, BarragePacket, Object> channelContext, BarragePacket packet, boolean isSentSuccess) throws Exception
	{
		log.info("onAfterSent channelContext:{}, packet:{}, isSentSuccess:{}", channelContext, /*Json.toJson(packet)*/JSON.toJSONString(packet), isSentSuccess);
	}

	/** 
	 * @param channelContext
	 * @param packet
	 * @param packetSize
	 * @throws Exception
	 * @authorDavidKing
	 */
	@Override
	public void onAfterReceived(ChannelContext<BarrageSessionContext, BarragePacket, Object> channelContext, BarragePacket packet, int packetSize) throws Exception
	{
		log.info("onAfterReceived channelContext:{}, packet:{}, packetSize:{}", channelContext,/*Json.toJson(packet)*/JSON.toJSONString(packet), packetSize);
	}

	/** 
	 * @param channelContext
	 * @param throwable
	 * @param remark
	 * @param isRemove
	 * @throws Exception
	 * @authorDavidKing
	 */
	@Override
	public void onAfterClose(ChannelContext<BarrageSessionContext, BarragePacket, Object> channelContext, Throwable throwable, String remark, boolean isRemove) throws Exception
	{
		log.info("onAfterClose channelContext:{}, throwable:{}, remark:{}, isRemove:{}", channelContext, throwable, remark, isRemove);
	}
}
