package com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ParseException extends IllegalArgumentException {

    public static final class Base64DecodeException extends ParseException {
        public Base64DecodeException(String str) {
            super(str);
        }
    }

    public static final class ConvertStringToClassException extends ParseException {
        public ConvertStringToClassException(String str) {
            super(str);
        }
    }

    public static final class DecryptException extends ParseException {
        public DecryptException(String str) {
            super(str);
        }
    }

    public static final class UriDoesNotHaveParameterException extends ParseException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UriDoesNotHaveParameterException(Uri uri, String str) {
            super(uri + " does not contain " + str);
            uri.getClass();
        }
    }
}
