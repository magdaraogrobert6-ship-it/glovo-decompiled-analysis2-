package com.incognia.internal;

import android.content.Context;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class IEr {
    public final UserManager BGx;

    public IEr(Context context) {
        this.BGx = (UserManager) context.getSystemService(FeedbackEvent.UI);
    }

    public static Boolean BGx() {
        if (!XUh.BGx(XUh.BGx, 24, 0, 2)) {
            return null;
        }
        try {
            return Boolean.valueOf(UserManager.supportsMultipleUsers());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean x() {
        if (!XUh.BGx(XUh.BGx, 31, 0, 2)) {
            return null;
        }
        try {
            return Boolean.valueOf(UserManager.isHeadlessSystemUserMode());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean A1() {
        if (!XUh.BGx(XUh.BGx, 23, 0, 2)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.BGx.isSystemUser());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean HQ() {
        if (!XUh.BGx(XUh.BGx, 34, 0, 2)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.BGx.isAdminUser());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean N() {
        if (!XUh.BGx(XUh.BGx, 25, 0, 2)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.BGx.isDemoUser());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean VV3() {
        if (!XUh.BGx(XUh.BGx, 24, 0, 2)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.BGx.isQuietModeEnabled(Process.myUserHandle()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean fZl() {
        if (!XUh.BGx(XUh.BGx, 24, 0, 2)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.BGx.isUserUnlocked());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean hIl() {
        if (!XUh.BGx(XUh.BGx, 30, 0, 2)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.BGx.isManagedProfile());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean hs() {
        if (!XUh.BGx(XUh.BGx, 33, 0, 2)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.BGx.isProfile());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Integer mbG() {
        if (!XUh.BGx(XUh.BGx, 21, 0, 2)) {
            return null;
        }
        try {
            List<UserHandle> userProfiles = this.BGx.getUserProfiles();
            if (userProfiles != null) {
                return Integer.valueOf(userProfiles.size());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Boolean q() {
        if (!XUh.BGx(XUh.BGx, 31, 0, 2)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.BGx.isUserForeground());
        } catch (Throwable unused) {
            return null;
        }
    }
}
