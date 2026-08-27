package io.sentry.android.core.internal.threaddump;

import bo.app.af$$ExternalSyntheticOutline0;
import io.sentry.SentryOptions;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol._init_lambda2;
import io.sentry.protocol.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
import io.sentry.protocol.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.UriActionExternalSyntheticLambda1;
import o.asComposePath;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class write {
    public final boolean ParcelableVolumeInfo;
    public final SentryOptions PlaybackStateCompat;
    public final UriActionExternalSyntheticLambda1 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public static final Pattern IconCompatParcelizer = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    public static final Pattern read = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    public static final Pattern MediaDescriptionCompat = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
    public static final Pattern RemoteActionCompatParcelizer = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern write = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern MediaSessionCompatQueueItem = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern MediaBrowserCompatMediaItem = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern MediaMetadataCompat = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern PlaybackStateCompatCustomAction = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern RatingCompat = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    public static final Pattern MediaSessionCompatResultReceiverWrapper = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern serializer = Pattern.compile("\\s+");
    public final HashMap MediaSessionCompatToken = new HashMap();
    public final ArrayList ResultReceiver = new ArrayList();

    public final ArrayList read() {
        return this.ResultReceiver;
    }

    public final ArrayList IconCompatParcelizer() {
        return new ArrayList(this.MediaSessionCompatToken.values());
    }

    public write(SentryOptions sentryOptions, boolean z) {
        this.PlaybackStateCompat = sentryOptions;
        this.ParcelableVolumeInfo = z;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new UriActionExternalSyntheticLambda1(sentryOptions);
    }

    public static boolean serializer(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0318  */
    /* JADX WARN: Code duplicated, block: B:103:0x0346  */
    /* JADX WARN: Code duplicated, block: B:105:0x034e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0350  */
    /* JADX WARN: Code duplicated, block: B:107:0x0378  */
    /* JADX WARN: Code duplicated, block: B:108:0x037a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0383 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0385  */
    /* JADX WARN: Code duplicated, block: B:112:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:113:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x03bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:118:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:120:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x03f1 A[EDGE_INSN: B:139:0x03f1->B:125:0x03f1 BREAK  A[LOOP:1: B:48:0x0163->B:123:0x03db], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x03f1 A[EDGE_INSN: B:140:0x03f1->B:125:0x03f1 BREAK  A[LOOP:1: B:48:0x0163->B:123:0x03db], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x03db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0167  */
    /* JADX WARN: Code duplicated, block: B:53:0x017b  */
    /* JADX WARN: Code duplicated, block: B:55:0x018a  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x0217  */
    /* JADX WARN: Code duplicated, block: B:76:0x0239  */
    /* JADX WARN: Code duplicated, block: B:77:0x023c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0242  */
    /* JADX WARN: Code duplicated, block: B:81:0x024a  */
    /* JADX WARN: Code duplicated, block: B:82:0x026a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0277  */
    /* JADX WARN: Code duplicated, block: B:86:0x0282  */
    /* JADX WARN: Code duplicated, block: B:88:0x028c  */
    /* JADX WARN: Code duplicated, block: B:89:0x02be  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x02ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:97:0x0310  */
    /* JADX WARN: Code duplicated, block: B:99:0x0316 A[DONT_INVERT] */
    public final void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        Pattern pattern;
        String str;
        SentryOptions sentryOptions;
        ArrayList arrayList;
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28;
        serializer serializerVarIconCompatParcelizer;
        String str2;
        SentryOptions sentryOptions2;
        Matcher matcher11;
        Matcher matcher12;
        Matcher matcher13;
        Matcher matcher14;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr29;
        String strGroup;
        Integer numValueOf;
        String strGroup2;
        String strWrite;
        HashMap map;
        String strGroup3;
        Integer numValueOf2;
        boolean zEquals;
        boolean z;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
        int i = remoteActionCompatParcelizer2.RemoteActionCompatParcelizer;
        Pattern pattern2 = IconCompatParcelizer;
        String str3 = "";
        Matcher matcher15 = pattern2.matcher("");
        Pattern pattern3 = read;
        Matcher matcher16 = pattern3.matcher("");
        while (remoteActionCompatParcelizer2.serializer < i) {
            serializer serializerVarIconCompatParcelizer2 = remoteActionCompatParcelizer.IconCompatParcelizer();
            SentryOptions sentryOptions3 = this.PlaybackStateCompat;
            String str4 = "Internal error while parsing thread dump.";
            if (serializerVarIconCompatParcelizer2 == null) {
                sentryOptions3.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str5 = serializerVarIconCompatParcelizer2.serializer;
            if (serializer(matcher15, str5) || serializer(matcher16, str5)) {
                remoteActionCompatParcelizer2.serializer--;
                _init_lambda2 _init_lambda2Var = new _init_lambda2();
                Matcher matcher17 = pattern2.matcher(str3);
                Matcher matcher18 = pattern3.matcher(str3);
                if (remoteActionCompatParcelizer2.serializer >= i) {
                    pattern = pattern2;
                    _init_lambda2Var = null;
                } else {
                    serializer serializerVarIconCompatParcelizer3 = remoteActionCompatParcelizer.IconCompatParcelizer();
                    if (serializerVarIconCompatParcelizer3 == null) {
                        sentryOptions3.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                        pattern = pattern2;
                        _init_lambda2Var = null;
                    } else {
                        String str6 = serializerVarIconCompatParcelizer3.serializer;
                        pattern = pattern2;
                        if (serializer(matcher17, str6)) {
                            Long l = read(matcher17, 4);
                            if (l == null) {
                                sentryOptions3.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                _init_lambda2Var = null;
                            } else {
                                _init_lambda2Var.IconCompatParcelizer = l;
                                _init_lambda2Var.MediaSessionCompatQueueItem = matcher17.group(1);
                                String strGroup4 = matcher17.group(5);
                                if (strGroup4 != null) {
                                    if (strGroup4.contains(" ")) {
                                        _init_lambda2Var.MediaDescriptionCompat = strGroup4.substring(0, strGroup4.indexOf(32));
                                    } else {
                                        _init_lambda2Var.MediaDescriptionCompat = strGroup4;
                                    }
                                }
                                str = _init_lambda2Var.MediaSessionCompatQueueItem;
                                if (str != null) {
                                    zEquals = str.equals("main");
                                    _init_lambda2Var.MediaMetadataCompat = Boolean.valueOf(zEquals);
                                    _init_lambda2Var.write = Boolean.valueOf(zEquals);
                                    if (zEquals || this.ParcelableVolumeInfo) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    _init_lambda2Var.read = Boolean.valueOf(z);
                                }
                                sentryOptions = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write;
                                arrayList = new ArrayList();
                                matcher = MediaDescriptionCompat.matcher(str3);
                                matcher2 = RemoteActionCompatParcelizer.matcher(str3);
                                matcher3 = write.matcher(str3);
                                matcher4 = MediaSessionCompatQueueItem.matcher(str3);
                                matcher5 = MediaMetadataCompat.matcher(str3);
                                matcher6 = MediaBrowserCompatMediaItem.matcher(str3);
                                matcher7 = RatingCompat.matcher(str3);
                                matcher8 = PlaybackStateCompatCustomAction.matcher(str3);
                                matcher9 = MediaSessionCompatResultReceiverWrapper.matcher(str3);
                                matcher10 = serializer.matcher(str3);
                                r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = null;
                                while (true) {
                                    if (remoteActionCompatParcelizer2.serializer >= i) {
                                        serializerVarIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
                                        if (serializerVarIconCompatParcelizer == null) {
                                            sentryOptions3.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, str4, new Object[0]);
                                        } else {
                                            str2 = serializerVarIconCompatParcelizer.serializer;
                                            i = i;
                                            if (serializer(matcher2, str2)) {
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = new r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                                sentryOptions2 = sentryOptions3;
                                                String strM = af$$ExternalSyntheticOutline0.m(matcher2.group(1), ".", matcher2.group(2));
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompat = strM;
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaBrowserCompatMediaItem = matcher2.group(3);
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaMetadataCompat = matcher2.group(4);
                                                strGroup3 = matcher2.group(5);
                                                if (strGroup3 != null || strGroup3.length() == 0) {
                                                    numValueOf2 = null;
                                                } else {
                                                    int i2 = Integer.parseInt(strGroup3);
                                                    numValueOf2 = Integer.valueOf(i2);
                                                    if (i2 < 0) {
                                                        numValueOf2 = null;
                                                    }
                                                }
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompatCustomAction = numValueOf2;
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatQueueItem = UriActionExternalSyntheticLambda1.RemoteActionCompatParcelizer(strM, sentryOptions.getInAppIncludes(), sentryOptions.getInAppExcludes());
                                                arrayList.add(r8lambdah6vvr6zuwa2u1fe0kskpogpr28);
                                                str4 = str4;
                                                matcher2 = matcher2;
                                            } else {
                                                sentryOptions2 = sentryOptions3;
                                                if (serializer(matcher, str2)) {
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr29 = new r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr29.IconCompatParcelizer = matcher.group(3);
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr29.MediaBrowserCompatMediaItem = matcher.group(6);
                                                    strGroup = matcher.group(7);
                                                    if (strGroup != null || strGroup.length() == 0) {
                                                        numValueOf = null;
                                                    } else {
                                                        numValueOf = Integer.valueOf(Integer.parseInt(strGroup));
                                                    }
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr29.PlaybackStateCompatCustomAction = numValueOf;
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr29.MediaSessionCompatToken = "0x" + matcher.group(2);
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr29.ParcelableVolumeInfo = "native";
                                                    strGroup2 = matcher.group(8);
                                                    if (strGroup2 == null) {
                                                        strWrite = null;
                                                    } else {
                                                        strWrite = asComposePath.write(strGroup2);
                                                    }
                                                    if (strWrite != null) {
                                                        map = this.MediaSessionCompatToken;
                                                        if (!map.containsKey(strWrite)) {
                                                            DebugImage debugImage = new DebugImage();
                                                            debugImage.setDebugId(strWrite);
                                                            debugImage.setType("elf");
                                                            debugImage.setCodeFile(matcher.group(4));
                                                            debugImage.setCodeId(strGroup2);
                                                            map.put(strWrite, debugImage);
                                                        }
                                                        r8lambdah6vvr6zuwa2u1fe0kskpogpr29.RemoteActionCompatParcelizer = "rel:".concat(strWrite);
                                                    } else {
                                                        str4 = str4;
                                                        matcher2 = matcher2;
                                                    }
                                                    arrayList.add(r8lambdah6vvr6zuwa2u1fe0kskpogpr29);
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = null;
                                                } else {
                                                    str4 = str4;
                                                    matcher2 = matcher2;
                                                    if (serializer(matcher3, str2)) {
                                                        r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = new r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                                        String strM2 = af$$ExternalSyntheticOutline0.m(matcher3.group(1), ".", matcher3.group(2));
                                                        r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompat = strM2;
                                                        r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaBrowserCompatMediaItem = matcher3.group(3);
                                                        r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatQueueItem = UriActionExternalSyntheticLambda1.RemoteActionCompatParcelizer(strM2, sentryOptions.getInAppIncludes(), sentryOptions.getInAppExcludes());
                                                        r8lambdah6vvr6zuwa2u1fe0kskpogpr28.write = Boolean.TRUE;
                                                        arrayList.add(r8lambdah6vvr6zuwa2u1fe0kskpogpr28);
                                                    } else if (serializer(matcher4, str2)) {
                                                        if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                            r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                            r8lambdab5vcmy54sheijpjycpn0kuqsmca.write = 1;
                                                            r8lambdab5vcmy54sheijpjycpn0kuqsmca.RemoteActionCompatParcelizer = matcher4.group(1);
                                                            r8lambdab5vcmy54sheijpjycpn0kuqsmca.serializer = matcher4.group(2);
                                                            r8lambdab5vcmy54sheijpjycpn0kuqsmca.read = matcher4.group(3);
                                                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca;
                                                            write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca);
                                                        }
                                                    } else if (serializer(matcher5, str2)) {
                                                        if (serializer(matcher6, str2)) {
                                                            matcher11 = matcher7;
                                                            if (serializer(matcher11, str2)) {
                                                                if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                                    r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca2 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca2.write = 8;
                                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca2.RemoteActionCompatParcelizer = matcher11.group(1);
                                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca2.serializer = matcher11.group(2);
                                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca2.read = matcher11.group(3);
                                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca2.IconCompatParcelizer = read(matcher11, 4);
                                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca2;
                                                                    write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca2);
                                                                }
                                                                matcher12 = matcher8;
                                                                matcher13 = matcher9;
                                                                matcher14 = matcher10;
                                                            } else {
                                                                matcher12 = matcher8;
                                                                if (serializer(matcher12, str2)) {
                                                                    matcher13 = matcher9;
                                                                    if (serializer(matcher13, str2)) {
                                                                        if (str2.length() != 0) {
                                                                            break;
                                                                        }
                                                                        matcher14 = matcher10;
                                                                        if (serializer(matcher14, str2)) {
                                                                            break;
                                                                        }
                                                                    } else if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                                        r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca3 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca3.write = 8;
                                                                        r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca3;
                                                                        write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca3);
                                                                    }
                                                                } else if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                                    r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca4 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca4.write = 8;
                                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca4.RemoteActionCompatParcelizer = matcher12.group(1);
                                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca4.serializer = matcher12.group(2);
                                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca4.read = matcher12.group(3);
                                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca4;
                                                                    write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca4);
                                                                    matcher13 = matcher9;
                                                                } else {
                                                                    matcher13 = matcher9;
                                                                }
                                                                matcher14 = matcher10;
                                                            }
                                                        } else if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                            r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca5 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                            r8lambdab5vcmy54sheijpjycpn0kuqsmca5.write = 4;
                                                            r8lambdab5vcmy54sheijpjycpn0kuqsmca5.RemoteActionCompatParcelizer = matcher6.group(1);
                                                            r8lambdab5vcmy54sheijpjycpn0kuqsmca5.serializer = matcher6.group(2);
                                                            r8lambdab5vcmy54sheijpjycpn0kuqsmca5.read = matcher6.group(3);
                                                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca5;
                                                            write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca5);
                                                        }
                                                        matcher7 = matcher11;
                                                        matcher10 = matcher14;
                                                        matcher9 = matcher13;
                                                        matcher8 = matcher12;
                                                        str4 = str4;
                                                        sentryOptions3 = sentryOptions2;
                                                        i = i;
                                                        matcher2 = matcher2;
                                                        remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
                                                    } else if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                        r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca6 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca6.write = 2;
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca6.RemoteActionCompatParcelizer = matcher5.group(1);
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca6.serializer = matcher5.group(2);
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca6.read = matcher5.group(3);
                                                        r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca6;
                                                        write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca6);
                                                    }
                                                }
                                            }
                                            matcher11 = matcher7;
                                            matcher12 = matcher8;
                                            matcher13 = matcher9;
                                            matcher14 = matcher10;
                                            matcher7 = matcher11;
                                            matcher10 = matcher14;
                                            matcher9 = matcher13;
                                            matcher8 = matcher12;
                                            str4 = str4;
                                            sentryOptions3 = sentryOptions2;
                                            i = i;
                                            matcher2 = matcher2;
                                            remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
                                        }
                                    }
                                    i = i;
                                    break;
                                }
                                Collections.reverse(arrayList);
                                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh0 = new r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(arrayList);
                                r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.serializer = Boolean.TRUE;
                                _init_lambda2Var.MediaBrowserCompatMediaItem = r8lambdaypqlaaoriyrj3iy_tqzuutrvh0;
                            }
                        } else {
                            if (serializer(matcher18, str6)) {
                                Long l2 = read(matcher18, 3);
                                if (l2 == null) {
                                    sentryOptions3.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                    _init_lambda2Var = null;
                                } else {
                                    _init_lambda2Var.IconCompatParcelizer = l2;
                                    _init_lambda2Var.MediaSessionCompatQueueItem = matcher18.group(1);
                                }
                            }
                            str = _init_lambda2Var.MediaSessionCompatQueueItem;
                            if (str != null) {
                                zEquals = str.equals("main");
                                _init_lambda2Var.MediaMetadataCompat = Boolean.valueOf(zEquals);
                                _init_lambda2Var.write = Boolean.valueOf(zEquals);
                                if (zEquals) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                _init_lambda2Var.read = Boolean.valueOf(z);
                            }
                            sentryOptions = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write;
                            arrayList = new ArrayList();
                            matcher = MediaDescriptionCompat.matcher(str3);
                            matcher2 = RemoteActionCompatParcelizer.matcher(str3);
                            matcher3 = write.matcher(str3);
                            matcher4 = MediaSessionCompatQueueItem.matcher(str3);
                            matcher5 = MediaMetadataCompat.matcher(str3);
                            matcher6 = MediaBrowserCompatMediaItem.matcher(str3);
                            matcher7 = RatingCompat.matcher(str3);
                            matcher8 = PlaybackStateCompatCustomAction.matcher(str3);
                            matcher9 = MediaSessionCompatResultReceiverWrapper.matcher(str3);
                            matcher10 = serializer.matcher(str3);
                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = null;
                            while (true) {
                                if (remoteActionCompatParcelizer2.serializer >= i) {
                                    serializerVarIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
                                    if (serializerVarIconCompatParcelizer == null) {
                                        sentryOptions3.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, str4, new Object[0]);
                                    } else {
                                        str2 = serializerVarIconCompatParcelizer.serializer;
                                        i = i;
                                        if (serializer(matcher2, str2)) {
                                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = new r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                            sentryOptions2 = sentryOptions3;
                                            String strM3 = af$$ExternalSyntheticOutline0.m(matcher2.group(1), ".", matcher2.group(2));
                                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompat = strM3;
                                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaBrowserCompatMediaItem = matcher2.group(3);
                                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaMetadataCompat = matcher2.group(4);
                                            strGroup3 = matcher2.group(5);
                                            if (strGroup3 != null) {
                                                numValueOf2 = null;
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompatCustomAction = numValueOf2;
                                            r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatQueueItem = UriActionExternalSyntheticLambda1.RemoteActionCompatParcelizer(strM3, sentryOptions.getInAppIncludes(), sentryOptions.getInAppExcludes());
                                            arrayList.add(r8lambdah6vvr6zuwa2u1fe0kskpogpr28);
                                            str4 = str4;
                                            matcher2 = matcher2;
                                        } else {
                                            sentryOptions2 = sentryOptions3;
                                            if (serializer(matcher, str2)) {
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr29 = new r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr29.IconCompatParcelizer = matcher.group(3);
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr29.MediaBrowserCompatMediaItem = matcher.group(6);
                                                strGroup = matcher.group(7);
                                                if (strGroup != null) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr29.PlaybackStateCompatCustomAction = numValueOf;
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr29.MediaSessionCompatToken = "0x" + matcher.group(2);
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr29.ParcelableVolumeInfo = "native";
                                                strGroup2 = matcher.group(8);
                                                if (strGroup2 == null) {
                                                    strWrite = null;
                                                } else {
                                                    strWrite = asComposePath.write(strGroup2);
                                                }
                                                if (strWrite != null) {
                                                    map = this.MediaSessionCompatToken;
                                                    if (!map.containsKey(strWrite)) {
                                                        DebugImage debugImage2 = new DebugImage();
                                                        debugImage2.setDebugId(strWrite);
                                                        debugImage2.setType("elf");
                                                        debugImage2.setCodeFile(matcher.group(4));
                                                        debugImage2.setCodeId(strGroup2);
                                                        map.put(strWrite, debugImage2);
                                                    }
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr29.RemoteActionCompatParcelizer = "rel:".concat(strWrite);
                                                } else {
                                                    str4 = str4;
                                                    matcher2 = matcher2;
                                                }
                                                arrayList.add(r8lambdah6vvr6zuwa2u1fe0kskpogpr29);
                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = null;
                                            } else {
                                                str4 = str4;
                                                matcher2 = matcher2;
                                                if (serializer(matcher3, str2)) {
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = new r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                                    String strM4 = af$$ExternalSyntheticOutline0.m(matcher3.group(1), ".", matcher3.group(2));
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.PlaybackStateCompat = strM4;
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaBrowserCompatMediaItem = matcher3.group(3);
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatQueueItem = UriActionExternalSyntheticLambda1.RemoteActionCompatParcelizer(strM4, sentryOptions.getInAppIncludes(), sentryOptions.getInAppExcludes());
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.write = Boolean.TRUE;
                                                    arrayList.add(r8lambdah6vvr6zuwa2u1fe0kskpogpr28);
                                                } else if (serializer(matcher4, str2)) {
                                                    if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                        r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca7 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca7.write = 1;
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca7.RemoteActionCompatParcelizer = matcher4.group(1);
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca7.serializer = matcher4.group(2);
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca7.read = matcher4.group(3);
                                                        r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca7;
                                                        write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca7);
                                                    }
                                                } else if (serializer(matcher5, str2)) {
                                                    if (serializer(matcher6, str2)) {
                                                        matcher11 = matcher7;
                                                        if (serializer(matcher11, str2)) {
                                                            if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                                r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca8 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                                r8lambdab5vcmy54sheijpjycpn0kuqsmca8.write = 8;
                                                                r8lambdab5vcmy54sheijpjycpn0kuqsmca8.RemoteActionCompatParcelizer = matcher11.group(1);
                                                                r8lambdab5vcmy54sheijpjycpn0kuqsmca8.serializer = matcher11.group(2);
                                                                r8lambdab5vcmy54sheijpjycpn0kuqsmca8.read = matcher11.group(3);
                                                                r8lambdab5vcmy54sheijpjycpn0kuqsmca8.IconCompatParcelizer = read(matcher11, 4);
                                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca8;
                                                                write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca8);
                                                            }
                                                            matcher12 = matcher8;
                                                            matcher13 = matcher9;
                                                            matcher14 = matcher10;
                                                        } else {
                                                            matcher12 = matcher8;
                                                            if (serializer(matcher12, str2)) {
                                                                matcher13 = matcher9;
                                                                if (serializer(matcher13, str2)) {
                                                                    if (str2.length() != 0) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    matcher14 = matcher10;
                                                                    if (serializer(matcher14, str2)) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                } else if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                                    r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca9 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca9.write = 8;
                                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca9;
                                                                    write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca9);
                                                                }
                                                            } else if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                                r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca10 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                                r8lambdab5vcmy54sheijpjycpn0kuqsmca10.write = 8;
                                                                r8lambdab5vcmy54sheijpjycpn0kuqsmca10.RemoteActionCompatParcelizer = matcher12.group(1);
                                                                r8lambdab5vcmy54sheijpjycpn0kuqsmca10.serializer = matcher12.group(2);
                                                                r8lambdab5vcmy54sheijpjycpn0kuqsmca10.read = matcher12.group(3);
                                                                r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca10;
                                                                write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca10);
                                                                matcher13 = matcher9;
                                                            } else {
                                                                matcher13 = matcher9;
                                                            }
                                                            matcher14 = matcher10;
                                                        }
                                                    } else if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                        r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca11 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca11.write = 4;
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca11.RemoteActionCompatParcelizer = matcher6.group(1);
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca11.serializer = matcher6.group(2);
                                                        r8lambdab5vcmy54sheijpjycpn0kuqsmca11.read = matcher6.group(3);
                                                        r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca11;
                                                        write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca11);
                                                    }
                                                    matcher7 = matcher11;
                                                    matcher10 = matcher14;
                                                    matcher9 = matcher13;
                                                    matcher8 = matcher12;
                                                    str4 = str4;
                                                    sentryOptions3 = sentryOptions2;
                                                    i = i;
                                                    matcher2 = matcher2;
                                                    remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
                                                } else if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28 != null) {
                                                    r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca12 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca12.write = 2;
                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca12.RemoteActionCompatParcelizer = matcher5.group(1);
                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca12.serializer = matcher5.group(2);
                                                    r8lambdab5vcmy54sheijpjycpn0kuqsmca12.read = matcher5.group(3);
                                                    r8lambdah6vvr6zuwa2u1fe0kskpogpr28.MediaSessionCompatResultReceiverWrapper = r8lambdab5vcmy54sheijpjycpn0kuqsmca12;
                                                    write(_init_lambda2Var, r8lambdab5vcmy54sheijpjycpn0kuqsmca12);
                                                }
                                            }
                                        }
                                        matcher11 = matcher7;
                                        matcher12 = matcher8;
                                        matcher13 = matcher9;
                                        matcher14 = matcher10;
                                        matcher7 = matcher11;
                                        matcher10 = matcher14;
                                        matcher9 = matcher13;
                                        matcher8 = matcher12;
                                        str4 = str4;
                                        sentryOptions3 = sentryOptions2;
                                        i = i;
                                        matcher2 = matcher2;
                                        remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
                                    }
                                }
                                i = i;
                                break;
                            }
                            Collections.reverse(arrayList);
                            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh1 = new r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(arrayList);
                            r8lambdaypqlaaoriyrj3iy_tqzuutrvh1.serializer = Boolean.TRUE;
                            _init_lambda2Var.MediaBrowserCompatMediaItem = r8lambdaypqlaaoriyrj3iy_tqzuutrvh1;
                        }
                    }
                }
                if (_init_lambda2Var != null) {
                    this.ResultReceiver.add(_init_lambda2Var);
                }
            } else {
                i = i;
                pattern = pattern2;
                str3 = str3;
                matcher15 = matcher15;
                pattern3 = pattern3;
                matcher16 = matcher16;
            }
            remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
            pattern2 = pattern;
            matcher15 = matcher15;
            pattern3 = pattern3;
            matcher16 = matcher16;
            str3 = str3;
            i = i;
        }
    }

    public static Long read(Matcher matcher, int i) {
        String strGroup = matcher.group(i);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static void write(_init_lambda2 _init_lambda2Var, r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca) {
        Map map = _init_lambda2Var.RemoteActionCompatParcelizer;
        if (map == null) {
            map = new HashMap();
        }
        r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca2 = (r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA) map.get(r8lambdab5vcmy54sheijpjycpn0kuqsmca.RemoteActionCompatParcelizer);
        if (r8lambdab5vcmy54sheijpjycpn0kuqsmca2 != null) {
            r8lambdab5vcmy54sheijpjycpn0kuqsmca2.write = Math.max(r8lambdab5vcmy54sheijpjycpn0kuqsmca2.write, r8lambdab5vcmy54sheijpjycpn0kuqsmca.write);
        } else {
            String str = r8lambdab5vcmy54sheijpjycpn0kuqsmca.RemoteActionCompatParcelizer;
            r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA r8lambdab5vcmy54sheijpjycpn0kuqsmca3 = new r8lambdab5vcMy54SheiJPJYcPN0KUQsMCA();
            r8lambdab5vcmy54sheijpjycpn0kuqsmca3.write = r8lambdab5vcmy54sheijpjycpn0kuqsmca.write;
            r8lambdab5vcmy54sheijpjycpn0kuqsmca3.RemoteActionCompatParcelizer = str;
            r8lambdab5vcmy54sheijpjycpn0kuqsmca3.serializer = r8lambdab5vcmy54sheijpjycpn0kuqsmca.serializer;
            r8lambdab5vcmy54sheijpjycpn0kuqsmca3.read = r8lambdab5vcmy54sheijpjycpn0kuqsmca.read;
            r8lambdab5vcmy54sheijpjycpn0kuqsmca3.IconCompatParcelizer = r8lambdab5vcmy54sheijpjycpn0kuqsmca.IconCompatParcelizer;
            r8lambdab5vcmy54sheijpjycpn0kuqsmca3.MediaBrowserCompatMediaItem = Options.Companion.RemoteActionCompatParcelizer(r8lambdab5vcmy54sheijpjycpn0kuqsmca.MediaBrowserCompatMediaItem);
            map.put(str, r8lambdab5vcmy54sheijpjycpn0kuqsmca3);
        }
        _init_lambda2Var.RemoteActionCompatParcelizer = map;
    }
}
