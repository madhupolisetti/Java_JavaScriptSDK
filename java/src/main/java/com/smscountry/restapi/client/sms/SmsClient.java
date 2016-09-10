/**
 * 
 */
package com.smscountry.restapi.client.sms;

/**
 * @author Sajeesh
 *
 */
public interface SmsClient {

	public SmsResponse sendSMS(final SmsRequest request);

	public SmsResponse getSMSDetails(final String messageUUID);

	public SmsResponse getSMSCollection(final String fromDate, final String toDate, final String senderId,
			final String offset, final String limit);

	public SmsResponse sendBulkSMS(final SmsRequest request);

}
