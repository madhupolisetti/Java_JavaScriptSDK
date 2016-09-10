/**
 * 
 */
package com.smscountry.restapi.client.calls;

/**
 * @author Sajeesh
 *
 */
public interface CallClient {

	public CallResponse createNewCall(final CallRequest request);

	public CallResponse createBulkCall(final CallRequest request);

	public CallResponse getCallDetails(final String callUUID);

	public CallResponse getCallList(final String fromDate, final String toDate, final String senderId,
			final String offset, final String limit);

	public CallResponse playSound(final CallRequest request, final String callUUID);

	public CallResponse stopSound(final String callUUID);

	public CallResponse startRecording(final CallRequest request, final String callUUID);

	public CallResponse stopRecording(final String callUUID, final String recordingUUID);

	public CallResponse getRecordingDetails(final String callUUID, final String recordingUUID);

	public CallResponse getAllRecordingDetails(final String callUUID);

	public CallResponse disconnectCall(final String callUUID);

	public CallResponse disconnectMultipleCalls(final CallRequest request);
}
