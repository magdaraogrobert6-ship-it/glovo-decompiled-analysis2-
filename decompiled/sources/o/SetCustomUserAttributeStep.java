package o;

import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class SetCustomUserAttributeStep implements getSecondArg {
    public final io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer serializer;

    @Override // o.getSecondArg
    public final String ComponentActivity() {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() != io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            return remoteActionCompatParcelizer.ParcelableVolumeInfo();
        }
        remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
        return null;
    }

    @Override // o.getSecondArg
    public final void IconCompatParcelizer() {
        this.serializer.RemoteActionCompatParcelizer();
    }

    @Override // o.getSecondArg
    public final double MediaBrowserCompatMediaItem() {
        return this.serializer.MediaMetadataCompat();
    }

    @Override // o.getSecondArg
    public final float MediaDescriptionCompat() {
        return (float) this.serializer.MediaMetadataCompat();
    }

    @Override // o.getSecondArg
    public final Float MediaMetadataCompat() {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() != io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            return Float.valueOf(MediaDescriptionCompat());
        }
        remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
        return null;
    }

    @Override // o.getSecondArg
    public final Double MediaSessionCompatQueueItem() {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() != io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            return Double.valueOf(remoteActionCompatParcelizer.MediaMetadataCompat());
        }
        remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
        return null;
    }

    @Override // o.getSecondArg
    public final int MediaSessionCompatResultReceiverWrapper() {
        return this.serializer.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.getSecondArg
    public final long MediaSessionCompatToken() {
        return this.serializer.PlaybackStateCompat();
    }

    @Override // o.getSecondArg
    public final Long ParcelableVolumeInfo() {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() != io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            return Long.valueOf(remoteActionCompatParcelizer.PlaybackStateCompat());
        }
        remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
        return null;
    }

    @Override // o.getSecondArg
    public final String PlaybackStateCompat() {
        return this.serializer.MediaSessionCompatToken();
    }

    @Override // o.getSecondArg
    public final Integer PlaybackStateCompatCustomAction() {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() != io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            return Integer.valueOf(remoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
        }
        remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
        return null;
    }

    @Override // o.getSecondArg
    public final Boolean RatingCompat() {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() != io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            return Boolean.valueOf(remoteActionCompatParcelizer.RatingCompat());
        }
        remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
        return null;
    }

    @Override // o.getSecondArg
    public final Date RemoteActionCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
            return null;
        }
        String strParcelableVolumeInfo = remoteActionCompatParcelizer.ParcelableVolumeInfo();
        if (strParcelableVolumeInfo == null) {
            return null;
        }
        try {
            try {
                return setNativeShader.write(strParcelableVolumeInfo);
            } catch (Exception e) {
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error when deserializing millis timestamp format.", e);
                return null;
            }
        } catch (Exception unused) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            int iSerializer2 = isAppSetIdReadingEnabled.serializer();
            int iSerializer3 = isAppSetIdReadingEnabled.serializer();
            return (Date) setNativeShader.read(1269650257, isAppSetIdReadingEnabled.serializer(), iSerializer2, new Object[]{strParcelableVolumeInfo}, iSerializer, iSerializer3, -1269650256);
        }
    }

    @Override // o.getSecondArg
    public final HashMap RemoteActionCompatParcelizer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, IBrazeActionStep iBrazeActionStep) {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
            return null;
        }
        remoteActionCompatParcelizer.write();
        HashMap map = new HashMap();
        if (remoteActionCompatParcelizer.MediaSessionCompatQueueItem()) {
            while (true) {
                try {
                    map.put(remoteActionCompatParcelizer.MediaSessionCompatToken(), iBrazeActionStep.write(this, brazeActionParserExternalSyntheticLambda0));
                } catch (Exception e) {
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to deserialize object in map.", e);
                }
                if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() != io.sentry.vendor.gson.stream.IconCompatParcelizer.BEGIN_OBJECT && remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() != io.sentry.vendor.gson.stream.IconCompatParcelizer.NAME) {
                    break;
                }
            }
        }
        remoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
        return map;
    }

    @Override // o.getSecondArg
    public final void RemoteActionCompatParcelizer() {
        this.serializer.read();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    @Override // o.getSecondArg
    public final void ResultReceiver() throws IOException {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        int i = 0;
        do {
            remoteActionCompatParcelizer = this.serializer;
            int iIconCompatParcelizer = remoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
            if (iIconCompatParcelizer == 0) {
                iIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
            }
            if (iIconCompatParcelizer == 3) {
                remoteActionCompatParcelizer.write(1);
            } else {
                if (iIconCompatParcelizer == 1) {
                    remoteActionCompatParcelizer.write(3);
                } else if (iIconCompatParcelizer == 4 || iIconCompatParcelizer == 2) {
                    remoteActionCompatParcelizer.MediaSessionCompatToken--;
                    i--;
                } else if (iIconCompatParcelizer == 14 || iIconCompatParcelizer == 10) {
                    while (true) {
                        int i2 = 0;
                        while (true) {
                            int i3 = remoteActionCompatParcelizer.PlaybackStateCompatCustomAction + i2;
                            if (i3 < remoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
                                char c = remoteActionCompatParcelizer.write[i3];
                                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (c != '/' && c != '=') {
                                                if (c != '{' && c != '}' && c != ':') {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    remoteActionCompatParcelizer.serializer();
                                }
                                remoteActionCompatParcelizer.PlaybackStateCompatCustomAction += i2;
                            } else {
                                remoteActionCompatParcelizer.PlaybackStateCompatCustomAction = i3;
                                if (!remoteActionCompatParcelizer.RemoteActionCompatParcelizer(1)) {
                                }
                            }
                        }
                    }
                } else if (iIconCompatParcelizer == 8 || iIconCompatParcelizer == 12) {
                    remoteActionCompatParcelizer.write('\'');
                } else if (iIconCompatParcelizer == 9 || iIconCompatParcelizer == 13) {
                    remoteActionCompatParcelizer.write('\"');
                } else if (iIconCompatParcelizer == 16) {
                    remoteActionCompatParcelizer.PlaybackStateCompatCustomAction += remoteActionCompatParcelizer.ParcelableVolumeInfo;
                }
                remoteActionCompatParcelizer.MediaBrowserCompatMediaItem = 0;
            }
            i++;
            remoteActionCompatParcelizer.MediaBrowserCompatMediaItem = 0;
        } while (i != 0);
        int[] iArr = remoteActionCompatParcelizer.RatingCompat;
        int i4 = remoteActionCompatParcelizer.MediaSessionCompatToken - 1;
        iArr[i4] = iArr[i4] + 1;
        remoteActionCompatParcelizer.MediaDescriptionCompat[i4] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.serializer.close();
    }

    @Override // o.getSecondArg
    public final String r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return this.serializer.ParcelableVolumeInfo();
    }

    @Override // o.getSecondArg
    public final io.sentry.vendor.gson.stream.IconCompatParcelizer r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return this.serializer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
    }

    @Override // o.getSecondArg
    public final TimeZone read(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
            return null;
        }
        try {
            return TimeZone.getTimeZone(remoteActionCompatParcelizer.ParcelableVolumeInfo());
        } catch (Exception e) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    @Override // o.getSecondArg
    public final boolean read() {
        return this.serializer.MediaSessionCompatQueueItem();
    }

    @Override // o.getSecondArg
    public final Object serializer(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, IBrazeActionStep iBrazeActionStep) {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() != io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            return iBrazeActionStep.write(this, brazeActionParserExternalSyntheticLambda0);
        }
        remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
        return null;
    }

    @Override // o.getSecondArg
    public final void serializer() {
        this.serializer.MediaBrowserCompatMediaItem();
    }

    @Override // o.getSecondArg
    public final void serializer(boolean z) {
        this.serializer.serializer = z;
    }

    @Override // o.getSecondArg
    public final ArrayList write(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, IBrazeActionStep iBrazeActionStep) {
        io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() == io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL) {
            remoteActionCompatParcelizer.PlaybackStateCompatCustomAction();
            return null;
        }
        remoteActionCompatParcelizer.read();
        ArrayList arrayList = new ArrayList();
        if (remoteActionCompatParcelizer.MediaSessionCompatQueueItem()) {
            do {
                try {
                    arrayList.add(iBrazeActionStep.write(this, brazeActionParserExternalSyntheticLambda0));
                } catch (Exception e) {
                    brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to deserialize object in list.", e);
                }
            } while (remoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() == io.sentry.vendor.gson.stream.IconCompatParcelizer.BEGIN_OBJECT);
        }
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        return arrayList;
    }

    @Override // o.getSecondArg
    public final void write() {
        this.serializer.write();
    }

    @Override // o.getSecondArg
    public final Object r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 3);
        applydisplaycutoutmarginstocontentarealambda0.serializer(this);
        RemoveFromSubscriptionGroupStep removeFromSubscriptionGroupStepSerializer = applydisplaycutoutmarginstocontentarealambda0.serializer();
        if (removeFromSubscriptionGroupStepSerializer != null) {
            return removeFromSubscriptionGroupStepSerializer.RemoteActionCompatParcelizer();
        }
        return null;
    }

    @Override // o.getSecondArg
    public final void write(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, AbstractMap abstractMap, String str) {
        try {
            abstractMap.put(str, r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
        } catch (Exception e) {
            brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "Error deserializing unknown key: %s", str);
        }
    }

    public SetCustomUserAttributeStep(Reader reader) {
        this.serializer = new io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer(reader);
    }
}
