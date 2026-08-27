package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public final class UserTypeNotSetException extends Exception {
    public static final UserTypeNotSetException serializer = new UserTypeNotSetException("User Type not set. Unread count \ncannot be fetched without setting the user type");

    public UserTypeNotSetException(String str) {
        super(str);
    }
}
