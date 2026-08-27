package com.sentiance.sdk.payload.batching;

/* JADX INFO: loaded from: classes3.dex */
public enum BatchingEvaluation {
    SUCCESS,
    NON_BATCHABLE_PAYLOAD,
    TRIP_NOT_STARTED_YET,
    INITIAL_DELAY_NOT_PASSED,
    OLD_PAYLOAD_NOT_SUBMITTED_YET,
    PREVIOUS_SUBMISSION_OVERDUE
}
