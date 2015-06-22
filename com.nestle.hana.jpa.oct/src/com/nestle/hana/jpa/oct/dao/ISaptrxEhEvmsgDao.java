package com.nestle.hana.jpa.oct.dao;

import java.sql.Timestamp;
import java.util.List;
import com.nestle.hana.jpa.oct.model.SaptrxEhEvmsg;

public interface ISaptrxEhEvmsgDao {

	public SaptrxEhEvmsg add(String ehGuid, String addData, String builtEhHier,
			Timestamp earliestEvDate, Timestamp earliestMsgDte,
			String eventCode, Timestamp eventDate, Timestamp eventDateUtc,
			String eventExpTzone, String eventTzone, Timestamp latestEvDate,
			Timestamp latestMsgDate, String matchedEe, Timestamp msgDateUtc,
			String msgExpTzone, String msgGuid, Timestamp msgRcvdDate,
			String msgRcvdTzone, String notRelevant, Timestamp procDate,
			int seqNbr);

	public SaptrxEhEvmsg update(String ehGuid, String addData,
			String builtEhHier, Timestamp earliestEvDate,
			Timestamp earliestMsgDte, String eventCode, Timestamp eventDate,
			Timestamp eventDateUtc, String eventExpTzone, String eventTzone,
			Timestamp latestEvDate, Timestamp latestMsgDate, String matchedEe,
			Timestamp msgDateUtc, String msgExpTzone, String msgGuid,
			Timestamp msgRcvdDate, String msgRcvdTzone, String notRelevant,
			Timestamp procDate, int seqNbr);

	public SaptrxEhEvmsg add(SaptrxEhEvmsg evMsg);

	public SaptrxEhEvmsg update(SaptrxEhEvmsg evMsg);

	public SaptrxEhEvmsg remove(String ehGuid);

	public SaptrxEhEvmsg get(String ehGuid);

	public List<SaptrxEhEvmsg> retriveAll();

	// public List<SaptrxEhEvmsg> getAllWithStatus(String status);

}
