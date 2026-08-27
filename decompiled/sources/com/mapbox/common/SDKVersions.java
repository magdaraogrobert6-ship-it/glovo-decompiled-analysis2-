package com.mapbox.common;

import android.content.res.AssetManager;
import android.media.AudioTrack;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.graphics.Fields;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ensureSubscribedToInAppMessageEvents;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.setFontSizeR2X_6o;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes5.dex */
public final class SDKVersions {
    public static final Companion Companion = new Companion(null);
    private static final String MAPBOX_IDENTIFIER = "mapbox";
    private static final String SDK_VERSIONS_FOLDER = "sdk_versions";

    public static final List<String> getList() {
        return Companion.getList();
    }

    public static final class Companion {
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getList() throws Throwable {
            int i = 2 % 2;
            ArrayList arrayList = new ArrayList();
            AssetManager assets = MapboxSDKCommon.INSTANCE.getContext().getAssets();
            String[] list = assets.list(SDKVersions.SDK_VERSIONS_FOLDER);
            if (list != null) {
                int i2 = serializer + 61;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                for (String str : list) {
                    int i4 = RemoteActionCompatParcelizer + 27;
                    serializer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    str.getClass();
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) SDKVersions.MAPBOX_IDENTIFIER, true)) {
                        try {
                            Object[] objArr = {assets, SDKVersions.SDK_VERSIONS_FOLDER + File.separator + str};
                            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                            if (objRemoteActionCompatParcelizer == null) {
                                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26244), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37, View.getDefaultSize(0, 0) + 13, 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                            }
                            InputStream inputStream = (InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
                            inputStream.getClass();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, ensureSubscribedToInAppMessageEvents.write), 8192);
                            try {
                                arrayList.add(bufferedReader.readLine() + " (" + str + ')');
                                bufferedReader.close();
                                int i6 = RemoteActionCompatParcelizer + 85;
                                serializer = i6 % Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th}, sourceInformationContextOfdefault.read());
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            Throwable cause = th3.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th3;
                        }
                    }
                }
            }
            return arrayList;
        }
    }
}
