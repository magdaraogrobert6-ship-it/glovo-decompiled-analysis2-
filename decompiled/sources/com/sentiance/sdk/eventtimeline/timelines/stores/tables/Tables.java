package com.sentiance.sdk.eventtimeline.timelines.stores.tables;

import android.annotation.SuppressLint;
import com.sentiance.sdk.SdkException;
import java.util.Locale;
import o.InAppMessageControl;
import o.InAppMessageFull;
import o.InAppMessageHtml;
import o.getAssetUrls;
import o.getInAppMessageDarkThemeWrapper;
import o.getJsonObject;
import o.handleLogClicklambda1;
import o.handleLogClicklambda2;
import o.logImpressionlambda1;
import o.logImpressionlambda3;
import o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0;
import o.r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs;
import o.r8lambdaSywuHIWfLiZV_fav810RJNKPOo;
import o.r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98;
import o.r8lambdarXm3srEgcKmzPN35zK_oZPt51M;
import o.setBrazeManager;
import o.setClickBehaviorlambda0;

/* JADX INFO: loaded from: classes3.dex */
public enum Tables {
    COMMON(0),
    TRANSPORT_CHANGE(1),
    STATIONARY_METADATA(2),
    SCREEN(3),
    CALL(4),
    CRASH(5),
    TIMEZONE(6),
    ACTIVE_TAG(7),
    ACTIVE_VENUE(8),
    ACTIVE_VENUE_TAG(9),
    STATIONARY_VENUE(10),
    TRANSPORT_METADATA(11),
    HARSH_DRIVING_EVALUATIONS(12),
    SAFETY_SCORES(13),
    PHONE_USAGE_EVALUATIONS(14);

    public final int value;

    Tables(int i) {
        this.value = i;
    }

    @SuppressLint
    public r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> getTable() {
        if (this == COMMON) {
            return handleLogClicklambda2.read();
        }
        if (this == TRANSPORT_CHANGE) {
            return InAppMessageFull.read();
        }
        if (this == STATIONARY_METADATA) {
            return r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem();
        }
        if (this == SCREEN) {
            return r8lambdarXm3srEgcKmzPN35zK_oZPt51M.read();
        }
        if (this == CALL) {
            return logImpressionlambda1.read();
        }
        if (this == CRASH) {
            return setClickBehaviorlambda0.read();
        }
        if (this == TIMEZONE) {
            return getAssetUrls.read();
        }
        if (this == ACTIVE_TAG) {
            return handleLogClicklambda1.read();
        }
        if (this == ACTIVE_VENUE) {
            return getInAppMessageDarkThemeWrapper.read();
        }
        if (this == ACTIVE_VENUE_TAG) {
            return getJsonObject.read();
        }
        if (this == STATIONARY_VENUE) {
            return r8lambdaXwOf7HXV9ovpySUfUYRlJ2kKy98.read();
        }
        if (this == TRANSPORT_METADATA) {
            return InAppMessageHtml.MediaBrowserCompatMediaItem();
        }
        if (this == HARSH_DRIVING_EVALUATIONS) {
            return setBrazeManager.read();
        }
        if (this == SAFETY_SCORES) {
            return logImpressionlambda3.MediaBrowserCompatMediaItem();
        }
        if (this == PHONE_USAGE_EVALUATIONS) {
            return InAppMessageControl.read();
        }
        Locale locale = Locale.US;
        throw new SdkException("Table not defined for type " + name() + "(" + this.value + ")");
    }
}
