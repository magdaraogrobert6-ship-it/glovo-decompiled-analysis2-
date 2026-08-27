package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzz;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getOneEK5gGoQ {
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public final /* synthetic */ int serializer;

    public getOneEK5gGoQ(int i) {
        this.serializer = i;
    }

    public static getNumPadMoveHomeEK5gGoQ serializer(getPageUpEK5gGoQ getpageupek5ggoq, Iterator it, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        androidx.transition.TransitionValuesMaps transitionValuesMapsPlaybackStateCompatCustomAction;
        if (it != null) {
            while (it.hasNext()) {
                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq2 = (getNumPadMoveHomeEK5gGoQ) it.next();
                int i = getpageupek5ggoq.IconCompatParcelizer;
                if (i == 0) {
                    transitionValuesMapsPlaybackStateCompatCustomAction = getpageupek5ggoq.serializer.PlaybackStateCompatCustomAction();
                    String str = getpageupek5ggoq.RemoteActionCompatParcelizer;
                    transitionValuesMapsPlaybackStateCompatCustomAction.write(str, getnumpadmovehomeek5ggoq2);
                    ((HashMap) transitionValuesMapsPlaybackStateCompatCustomAction.RatingCompat).put(str, Boolean.TRUE);
                } else if (i != 1) {
                    transitionValuesMapsPlaybackStateCompatCustomAction = getpageupek5ggoq.serializer;
                    transitionValuesMapsPlaybackStateCompatCustomAction.write(getpageupek5ggoq.RemoteActionCompatParcelizer, getnumpadmovehomeek5ggoq2);
                } else {
                    transitionValuesMapsPlaybackStateCompatCustomAction = getpageupek5ggoq.serializer.PlaybackStateCompatCustomAction();
                    transitionValuesMapsPlaybackStateCompatCustomAction.write(getpageupek5ggoq.RemoteActionCompatParcelizer, getnumpadmovehomeek5ggoq2);
                }
                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite = transitionValuesMapsPlaybackStateCompatCustomAction.write((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoq);
                if (getnumpadmovehomeek5ggoqWrite instanceof getNumPadEqualsEK5gGoQ) {
                    getNumPadEqualsEK5gGoQ getnumpadequalsek5ggoq = (getNumPadEqualsEK5gGoQ) getnumpadmovehomeek5ggoqWrite;
                    String str2 = getnumpadequalsek5ggoq.serializer;
                    if ("break".equals(str2)) {
                        return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                    }
                    if ("return".equals(str2)) {
                        return getnumpadequalsek5ggoq;
                    }
                }
            }
        }
        return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
    }

    public final void read(String str) {
        if (!this.RemoteActionCompatParcelizer.contains(getTvInputComposite2EK5gGoQ.RemoteActionCompatParcelizer(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }

    public static boolean RemoteActionCompatParcelizer(getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq2) {
        if (getnumpadmovehomeek5ggoq.getClass().equals(getnumpadmovehomeek5ggoq2.getClass())) {
            if ((getnumpadmovehomeek5ggoq instanceof getOEK5gGoQ) || (getnumpadmovehomeek5ggoq instanceof getNumPadPageDownEK5gGoQ)) {
                return true;
            }
            if (getnumpadmovehomeek5ggoq instanceof getNumPadLeftParenthesisEK5gGoQ) {
                return (Double.isNaN(getnumpadmovehomeek5ggoq.write().doubleValue()) || Double.isNaN(getnumpadmovehomeek5ggoq2.write().doubleValue()) || getnumpadmovehomeek5ggoq.write().doubleValue() != getnumpadmovehomeek5ggoq2.write().doubleValue()) ? false : true;
            }
            if (getnumpadmovehomeek5ggoq instanceof getNumPadSubtractEK5gGoQ) {
                return getnumpadmovehomeek5ggoq.IconCompatParcelizer().equals(getnumpadmovehomeek5ggoq2.IconCompatParcelizer());
            }
            if (getnumpadmovehomeek5ggoq instanceof getNumPadEnterEK5gGoQ) {
                return getnumpadmovehomeek5ggoq.serializer().equals(getnumpadmovehomeek5ggoq2.serializer());
            }
            return getnumpadmovehomeek5ggoq == getnumpadmovehomeek5ggoq2;
        }
        if (((getnumpadmovehomeek5ggoq instanceof getOEK5gGoQ) || (getnumpadmovehomeek5ggoq instanceof getNumPadPageDownEK5gGoQ)) && ((getnumpadmovehomeek5ggoq2 instanceof getOEK5gGoQ) || (getnumpadmovehomeek5ggoq2 instanceof getNumPadPageDownEK5gGoQ))) {
            return true;
        }
        boolean z = getnumpadmovehomeek5ggoq instanceof getNumPadLeftParenthesisEK5gGoQ;
        if (z && (getnumpadmovehomeek5ggoq2 instanceof getNumPadSubtractEK5gGoQ)) {
            return RemoteActionCompatParcelizer(getnumpadmovehomeek5ggoq, new getNumPadLeftParenthesisEK5gGoQ(getnumpadmovehomeek5ggoq2.write()));
        }
        boolean z2 = getnumpadmovehomeek5ggoq instanceof getNumPadSubtractEK5gGoQ;
        if (z2 && (getnumpadmovehomeek5ggoq2 instanceof getNumPadLeftParenthesisEK5gGoQ)) {
            return RemoteActionCompatParcelizer(new getNumPadLeftParenthesisEK5gGoQ(getnumpadmovehomeek5ggoq.write()), getnumpadmovehomeek5ggoq2);
        }
        if (getnumpadmovehomeek5ggoq instanceof getNumPadEnterEK5gGoQ) {
            return RemoteActionCompatParcelizer(new getNumPadLeftParenthesisEK5gGoQ(getnumpadmovehomeek5ggoq.write()), getnumpadmovehomeek5ggoq2);
        }
        if (getnumpadmovehomeek5ggoq2 instanceof getNumPadEnterEK5gGoQ) {
            return RemoteActionCompatParcelizer(getnumpadmovehomeek5ggoq, new getNumPadLeftParenthesisEK5gGoQ(getnumpadmovehomeek5ggoq2.write()));
        }
        if ((z2 || z) && (getnumpadmovehomeek5ggoq2 instanceof getNumPadMultiplyEK5gGoQ)) {
            return RemoteActionCompatParcelizer(getnumpadmovehomeek5ggoq, new getNumPadSubtractEK5gGoQ(getnumpadmovehomeek5ggoq2.IconCompatParcelizer()));
        }
        if ((getnumpadmovehomeek5ggoq instanceof getNumPadMultiplyEK5gGoQ) && ((getnumpadmovehomeek5ggoq2 instanceof getNumPadSubtractEK5gGoQ) || (getnumpadmovehomeek5ggoq2 instanceof getNumPadLeftParenthesisEK5gGoQ))) {
            return RemoteActionCompatParcelizer(new getNumPadSubtractEK5gGoQ(getnumpadmovehomeek5ggoq.IconCompatParcelizer()), getnumpadmovehomeek5ggoq2);
        }
        return false;
    }

    public static boolean serializer(getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq2) {
        if (getnumpadmovehomeek5ggoq instanceof getNumPadMultiplyEK5gGoQ) {
            getnumpadmovehomeek5ggoq = new getNumPadSubtractEK5gGoQ(getnumpadmovehomeek5ggoq.IconCompatParcelizer());
        }
        if (getnumpadmovehomeek5ggoq2 instanceof getNumPadMultiplyEK5gGoQ) {
            getnumpadmovehomeek5ggoq2 = new getNumPadSubtractEK5gGoQ(getnumpadmovehomeek5ggoq2.IconCompatParcelizer());
        }
        if ((getnumpadmovehomeek5ggoq instanceof getNumPadSubtractEK5gGoQ) && (getnumpadmovehomeek5ggoq2 instanceof getNumPadSubtractEK5gGoQ)) {
            return ((getNumPadSubtractEK5gGoQ) getnumpadmovehomeek5ggoq).write.compareTo(((getNumPadSubtractEK5gGoQ) getnumpadmovehomeek5ggoq2).write) < 0;
        }
        double dDoubleValue = getnumpadmovehomeek5ggoq.write().doubleValue();
        double dDoubleValue2 = getnumpadmovehomeek5ggoq2.write().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:279:0x0809  */
    /* JADX WARN: Code duplicated, block: B:538:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v331 */
    /* JADX WARN: Type inference failed for: r12v336 */
    /* JADX WARN: Type inference failed for: r12v357, types: [o.getNumPadDirectionUpEK5gGoQ] */
    /* JADX WARN: Type inference failed for: r12v364, types: [o.getNumPadPageUpEK5gGoQ] */
    /* JADX WARN: Type inference failed for: r12v401 */
    /* JADX WARN: Type inference failed for: r12v402 */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.transition.TransitionValuesMaps] */
    /* JADX WARN: Type inference failed for: r7v62, types: [o.getNumPadMoveHomeEK5gGoQ] */
    public final getNumPadMoveHomeEK5gGoQ write(String str, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList) {
        boolean zRemoteActionCompatParcelizer;
        boolean zRemoteActionCompatParcelizer2;
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq;
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite;
        getOEK5gGoQ getoek5ggoq;
        getNumPadEqualsEK5gGoQ getnumpadequalsek5ggoq;
        getNumPadMoveHomeEK5gGoQ getnumpadleftparenthesisek5ggoq;
        ?? getnumpaddirectionupek5ggoq;
        String str2;
        int i = 0;
        switch (this.serializer) {
            case 0:
                getPasteEK5gGoQ getpasteek5ggoq = getPasteEK5gGoQ.ADD;
                switch (getTvInputComposite2EK5gGoQ.RemoteActionCompatParcelizer(str).ordinal()) {
                    case 4:
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.BITWISE_AND, 2, arrayList, 0)).write().doubleValue()) & getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue())));
                    case 5:
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.BITWISE_LEFT_SHIFT, 2, arrayList, 0)).write().doubleValue()) << ((int) (((long) getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue())) & 31))));
                    case 6:
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(~getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.BITWISE_NOT, 1, arrayList, 0)).write().doubleValue())));
                    case 7:
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.BITWISE_OR, 2, arrayList, 0)).write().doubleValue()) | getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue())));
                    case 8:
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.BITWISE_RIGHT_SHIFT, 2, arrayList, 0)).write().doubleValue()) >> ((int) (((long) getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue())) & 31))));
                    case 9:
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf((4294967295L & ((long) getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, arrayList, 0)).write().doubleValue()))) >>> ((int) (((long) getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue())) & 31))));
                    case 10:
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.BITWISE_XOR, 2, arrayList, 0)).write().doubleValue()) ^ getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue())));
                    default:
                        read(str);
                        throw null;
                }
            case 1:
                getTvInputComposite2EK5gGoQ.serializer(arrayList, 2, getTvInputComposite2EK5gGoQ.RemoteActionCompatParcelizer(str).name());
                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite2 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0));
                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite3 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                int iOrdinal = getTvInputComposite2EK5gGoQ.RemoteActionCompatParcelizer(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(getnumpadmovehomeek5ggoqWrite2, getnumpadmovehomeek5ggoqWrite3);
                    } else if (iOrdinal == 42) {
                        zRemoteActionCompatParcelizer = serializer(getnumpadmovehomeek5ggoqWrite2, getnumpadmovehomeek5ggoqWrite3);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zRemoteActionCompatParcelizer = serializer(getnumpadmovehomeek5ggoqWrite3, getnumpadmovehomeek5ggoqWrite2);
                                break;
                            case 38:
                                zRemoteActionCompatParcelizer = IconCompatParcelizer(getnumpadmovehomeek5ggoqWrite3, getnumpadmovehomeek5ggoqWrite2);
                                break;
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                zRemoteActionCompatParcelizer = getTvInputComposite2EK5gGoQ.serializer(getnumpadmovehomeek5ggoqWrite2, getnumpadmovehomeek5ggoqWrite3);
                                break;
                            case 40:
                                zRemoteActionCompatParcelizer2 = getTvInputComposite2EK5gGoQ.serializer(getnumpadmovehomeek5ggoqWrite2, getnumpadmovehomeek5ggoqWrite3);
                                break;
                            default:
                                read(str);
                                throw null;
                        }
                    } else {
                        zRemoteActionCompatParcelizer = IconCompatParcelizer(getnumpadmovehomeek5ggoqWrite2, getnumpadmovehomeek5ggoqWrite3);
                    }
                    zRemoteActionCompatParcelizer = !zRemoteActionCompatParcelizer2;
                } else {
                    zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getnumpadmovehomeek5ggoqWrite2, getnumpadmovehomeek5ggoqWrite3);
                }
                return zRemoteActionCompatParcelizer ? getNumPadMoveHomeEK5gGoQ.PlaybackStateCompatCustomAction : getNumPadMoveHomeEK5gGoQ.MediaSessionCompatToken;
            case 2:
                getPasteEK5gGoQ getpasteek5ggoq2 = getPasteEK5gGoQ.ADD;
                int iOrdinal2 = getTvInputComposite2EK5gGoQ.RemoteActionCompatParcelizer(str).ordinal();
                if (iOrdinal2 == 2) {
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq2 = (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.APPLY, 3, arrayList, 0);
                    zzz zzzVar = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                    zzz zzzVar2 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite4 = zzzVar.write(transitionValuesMaps, getnumpadmovehomeek5ggoq2);
                    String strIconCompatParcelizer = zzzVar2.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).IconCompatParcelizer();
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite5 = zzzVar2.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2));
                    if (!(getnumpadmovehomeek5ggoqWrite5 instanceof getNumPadDirectionUpEK5gGoQ)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Function arguments for Apply are not a list found ", getnumpadmovehomeek5ggoqWrite5.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!strIconCompatParcelizer.isEmpty()) {
                        return getnumpadmovehomeek5ggoqWrite4.read(strIconCompatParcelizer, transitionValuesMaps, (ArrayList) ((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite5).RemoteActionCompatParcelizer());
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Function name for apply is undefined");
                    return null;
                }
                if (iOrdinal2 == 15) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, getPasteEK5gGoQ.BREAK.name());
                    return getNumPadMoveHomeEK5gGoQ.MediaSessionCompatQueueItem;
                }
                if (iOrdinal2 == 25) {
                    return RemoteActionCompatParcelizer((androidx.transition.TransitionValuesMaps) transitionValuesMaps, arrayList);
                }
                if (iOrdinal2 == 41) {
                    getTvInputComposite2EK5gGoQ.read(arrayList, 2, getPasteEK5gGoQ.IF.name());
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq3 = (getNumPadMoveHomeEK5gGoQ) arrayList.get(0);
                    zzz zzzVar3 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                    zzz zzzVar4 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite6 = zzzVar3.write(transitionValuesMaps, getnumpadmovehomeek5ggoq3);
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite7 = zzzVar4.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite8 = arrayList.size() > 2 ? zzzVar4.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2)) : null;
                    getOEK5gGoQ getoek5ggoq2 = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                    if (!getnumpadmovehomeek5ggoqWrite6.serializer().booleanValue()) {
                        if (getnumpadmovehomeek5ggoqWrite8 != null) {
                            getnumpadmovehomeek5ggoqWrite = transitionValuesMaps.write((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite8);
                        } else {
                            getnumpadmovehomeek5ggoq = getoek5ggoq2;
                        }
                        if (true != (getnumpadmovehomeek5ggoq instanceof getNumPadEqualsEK5gGoQ)) {
                            return getoek5ggoq2;
                        }
                        return getnumpadmovehomeek5ggoq;
                    }
                    getnumpadmovehomeek5ggoqWrite = transitionValuesMaps.write((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite7);
                    getnumpadmovehomeek5ggoq = getnumpadmovehomeek5ggoqWrite;
                    if (true != (getnumpadmovehomeek5ggoq instanceof getNumPadEqualsEK5gGoQ)) {
                        return getoek5ggoq2;
                    }
                    return getnumpadmovehomeek5ggoq;
                }
                if (iOrdinal2 == 54) {
                    return new getNumPadDirectionUpEK5gGoQ(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return getNumPadMoveHomeEK5gGoQ.MediaMetadataCompat;
                    }
                    return new getNumPadEqualsEK5gGoQ("return", ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.RETURN, 1, arrayList, 0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        getTvInputComposite2EK5gGoQ.read(arrayList, 2, getPasteEK5gGoQ.DEFINE_FUNCTION.name());
                        getNumPadMoveEndEK5gGoQ getnumpadmoveendek5ggoqRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((androidx.transition.TransitionValuesMaps) transitionValuesMaps, arrayList);
                        String str3 = getnumpadmoveendek5ggoqRemoteActionCompatParcelizer.serializer;
                        if (str3 == null) {
                            transitionValuesMaps.RemoteActionCompatParcelizer("", getnumpadmoveendek5ggoqRemoteActionCompatParcelizer);
                            return getnumpadmoveendek5ggoqRemoteActionCompatParcelizer;
                        }
                        transitionValuesMaps.RemoteActionCompatParcelizer(str3, getnumpadmoveendek5ggoqRemoteActionCompatParcelizer);
                        return getnumpadmoveendek5ggoqRemoteActionCompatParcelizer;
                    }
                    if (iOrdinal2 == 60) {
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq4 = (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.SWITCH, 3, arrayList, 0);
                        zzz zzzVar5 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                        zzz zzzVar6 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite9 = zzzVar5.write(transitionValuesMaps, getnumpadmovehomeek5ggoq4);
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite10 = zzzVar6.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite11 = zzzVar6.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2));
                        if (!(getnumpadmovehomeek5ggoqWrite10 instanceof getNumPadDirectionUpEK5gGoQ)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Malformed SWITCH statement, cases are not a list");
                            return null;
                        }
                        if (!(getnumpadmovehomeek5ggoqWrite11 instanceof getNumPadDirectionUpEK5gGoQ)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Malformed SWITCH statement, case statements are not a list");
                            return null;
                        }
                        getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq2 = (getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite10;
                        getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq3 = (getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite11;
                        boolean z = false;
                        for (int i2 = 0; i2 < getnumpaddirectionupek5ggoq2.MediaSessionCompatQueueItem(); i2++) {
                            if (z || getnumpadmovehomeek5ggoqWrite9.equals(zzzVar6.write(transitionValuesMaps, getnumpaddirectionupek5ggoq2.IconCompatParcelizer(i2)))) {
                                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite12 = zzzVar6.write(transitionValuesMaps, getnumpaddirectionupek5ggoq3.IconCompatParcelizer(i2));
                                if (getnumpadmovehomeek5ggoqWrite12 instanceof getNumPadEqualsEK5gGoQ) {
                                    return ((getNumPadEqualsEK5gGoQ) getnumpadmovehomeek5ggoqWrite12).serializer.equals("break") ? getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem : getnumpadmovehomeek5ggoqWrite12;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (getnumpaddirectionupek5ggoq2.MediaSessionCompatQueueItem() + 1 == getnumpaddirectionupek5ggoq3.MediaSessionCompatQueueItem()) {
                            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite13 = zzzVar6.write(transitionValuesMaps, getnumpaddirectionupek5ggoq3.IconCompatParcelizer(getnumpaddirectionupek5ggoq2.MediaSessionCompatQueueItem()));
                            if (getnumpadmovehomeek5ggoqWrite13 instanceof getNumPadEqualsEK5gGoQ) {
                                String str4 = ((getNumPadEqualsEK5gGoQ) getnumpadmovehomeek5ggoqWrite13).serializer;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return getnumpadmovehomeek5ggoqWrite13;
                                }
                            }
                        }
                        return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                    }
                    if (iOrdinal2 == 61) {
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq5 = (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.TERNARY, 3, arrayList, 0);
                        zzz zzzVar7 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                        zzz zzzVar8 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                        return zzzVar7.write(transitionValuesMaps, getnumpadmovehomeek5ggoq5).serializer().booleanValue() ? zzzVar8.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)) : zzzVar8.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case 11:
                            return transitionValuesMaps.PlaybackStateCompatCustomAction().write(new getNumPadDirectionUpEK5gGoQ(arrayList));
                        case 12:
                            getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, getPasteEK5gGoQ.BREAK.name());
                            return getNumPadMoveHomeEK5gGoQ.RatingCompat;
                        case 13:
                            break;
                        default:
                            read(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                }
                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite14 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0));
                return getnumpadmovehomeek5ggoqWrite14 instanceof getNumPadDirectionUpEK5gGoQ ? transitionValuesMaps.write((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite14) : getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
            case 3:
                getPasteEK5gGoQ getpasteek5ggoq3 = getPasteEK5gGoQ.ADD;
                int iOrdinal3 = getTvInputComposite2EK5gGoQ.RemoteActionCompatParcelizer(str).ordinal();
                if (iOrdinal3 == 1) {
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite15 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.AND, 2, arrayList, 0));
                    if (getnumpadmovehomeek5ggoqWrite15.serializer().booleanValue()) {
                        return ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                    }
                    return getnumpadmovehomeek5ggoqWrite15;
                }
                if (iOrdinal3 == 47) {
                    return new getNumPadEnterEK5gGoQ(Boolean.valueOf(!((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.NOT, 1, arrayList, 0)).serializer().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    read(str);
                    throw null;
                }
                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite16 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.OR, 2, arrayList, 0));
                if (getnumpadmovehomeek5ggoqWrite16.serializer().booleanValue()) {
                    return getnumpadmovehomeek5ggoqWrite16;
                }
                return ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
            case 4:
                getPasteEK5gGoQ getpasteek5ggoq4 = getPasteEK5gGoQ.ADD;
                int iOrdinal4 = getTvInputComposite2EK5gGoQ.RemoteActionCompatParcelizer(str).ordinal();
                if (iOrdinal4 == 65) {
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq6 = (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.WHILE, 4, arrayList, 0);
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq7 = (getNumPadMoveHomeEK5gGoQ) arrayList.get(1);
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq8 = (getNumPadMoveHomeEK5gGoQ) arrayList.get(2);
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq9 = (getNumPadMoveHomeEK5gGoQ) arrayList.get(3);
                    zzz zzzVar9 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                    zzz zzzVar10 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite17 = zzzVar9.write(transitionValuesMaps, getnumpadmovehomeek5ggoq9);
                    if (zzzVar10.write(transitionValuesMaps, getnumpadmovehomeek5ggoq8).serializer().booleanValue()) {
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite18 = transitionValuesMaps.write((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite17);
                        if (getnumpadmovehomeek5ggoqWrite18 instanceof getNumPadEqualsEK5gGoQ) {
                            getNumPadEqualsEK5gGoQ getnumpadequalsek5ggoq2 = (getNumPadEqualsEK5gGoQ) getnumpadmovehomeek5ggoqWrite18;
                            String str5 = getnumpadequalsek5ggoq2.serializer;
                            if ("break".equals(str5)) {
                                return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                            }
                            if ("return".equals(str5)) {
                                return getnumpadequalsek5ggoq2;
                            }
                        }
                    }
                    while (zzzVar10.write(transitionValuesMaps, getnumpadmovehomeek5ggoq6).serializer().booleanValue()) {
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite19 = transitionValuesMaps.write((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite17);
                        if (getnumpadmovehomeek5ggoqWrite19 instanceof getNumPadEqualsEK5gGoQ) {
                            getNumPadEqualsEK5gGoQ getnumpadequalsek5ggoq3 = (getNumPadEqualsEK5gGoQ) getnumpadmovehomeek5ggoqWrite19;
                            String str6 = getnumpadequalsek5ggoq3.serializer;
                            if ("break".equals(str6)) {
                                return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                            }
                            if ("return".equals(str6)) {
                                return getnumpadequalsek5ggoq3;
                            }
                        }
                        transitionValuesMaps.serializer(getnumpadmovehomeek5ggoq7);
                    }
                    return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                }
                switch (iOrdinal4) {
                    case 26:
                        if (!(MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.FOR_IN, 3, arrayList, 0) instanceof getNumPadSubtractEK5gGoQ)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strIconCompatParcelizer2 = ((getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite20 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite21 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2));
                        Iterator it = getnumpadmovehomeek5ggoqWrite20.read();
                        if (it != null) {
                            while (it.hasNext()) {
                                transitionValuesMaps.write(strIconCompatParcelizer2, (getNumPadMoveHomeEK5gGoQ) it.next());
                                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite22 = transitionValuesMaps.write((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite21);
                                if (getnumpadmovehomeek5ggoqWrite22 instanceof getNumPadEqualsEK5gGoQ) {
                                    getnumpadequalsek5ggoq = (getNumPadEqualsEK5gGoQ) getnumpadmovehomeek5ggoqWrite22;
                                    String str7 = getnumpadequalsek5ggoq.serializer;
                                    if ("break".equals(str7)) {
                                        getoek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                                    } else if ("return".equals(str7)) {
                                        return getnumpadequalsek5ggoq;
                                    }
                                }
                            }
                            getoek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                        } else {
                            getoek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                        }
                        return getoek5ggoq;
                    case 27:
                        if (!(MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.FOR_IN_CONST, 3, arrayList, 0) instanceof getNumPadSubtractEK5gGoQ)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Variable name in FOR_IN_CONST must be a string");
                            return null;
                        }
                        return serializer(new getPageUpEK5gGoQ(transitionValuesMaps, ((getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer(), 0), ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).read(), ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2)));
                    case 28:
                        if (!(MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.FOR_IN_LET, 3, arrayList, 0) instanceof getNumPadSubtractEK5gGoQ)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strIconCompatParcelizer3 = ((getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite23 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite24 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2));
                        Iterator it2 = getnumpadmovehomeek5ggoqWrite23.read();
                        if (it2 != null) {
                            while (it2.hasNext()) {
                                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq10 = (getNumPadMoveHomeEK5gGoQ) it2.next();
                                androidx.transition.TransitionValuesMaps transitionValuesMapsPlaybackStateCompatCustomAction = transitionValuesMaps.PlaybackStateCompatCustomAction();
                                transitionValuesMapsPlaybackStateCompatCustomAction.write(strIconCompatParcelizer3, getnumpadmovehomeek5ggoq10);
                                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite25 = transitionValuesMapsPlaybackStateCompatCustomAction.write((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite24);
                                if (getnumpadmovehomeek5ggoqWrite25 instanceof getNumPadEqualsEK5gGoQ) {
                                    getnumpadequalsek5ggoq = (getNumPadEqualsEK5gGoQ) getnumpadmovehomeek5ggoqWrite25;
                                    String str8 = getnumpadequalsek5ggoq.serializer;
                                    if ("break".equals(str8)) {
                                        getoek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                                    } else if ("return".equals(str8)) {
                                        return getnumpadequalsek5ggoq;
                                    }
                                }
                            }
                            getoek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                        } else {
                            getoek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                        }
                        return getoek5ggoq;
                    case 29:
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq11 = (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.FOR_LET, 4, arrayList, 0);
                        zzz zzzVar11 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                        zzz zzzVar12 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite26 = zzzVar11.write(transitionValuesMaps, getnumpadmovehomeek5ggoq11);
                        if (!(getnumpadmovehomeek5ggoqWrite26 instanceof getNumPadDirectionUpEK5gGoQ)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq4 = (getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite26;
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq12 = (getNumPadMoveHomeEK5gGoQ) arrayList.get(1);
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq13 = (getNumPadMoveHomeEK5gGoQ) arrayList.get(2);
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite27 = zzzVar12.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(3));
                        androidx.transition.TransitionValuesMaps transitionValuesMapsPlaybackStateCompatCustomAction2 = transitionValuesMaps.PlaybackStateCompatCustomAction();
                        for (int i3 = 0; i3 < getnumpaddirectionupek5ggoq4.MediaSessionCompatQueueItem(); i3++) {
                            String strIconCompatParcelizer4 = getnumpaddirectionupek5ggoq4.IconCompatParcelizer(i3).IconCompatParcelizer();
                            transitionValuesMapsPlaybackStateCompatCustomAction2.RemoteActionCompatParcelizer(strIconCompatParcelizer4, transitionValuesMaps.IconCompatParcelizer(strIconCompatParcelizer4));
                        }
                        while (zzzVar12.write(transitionValuesMaps, getnumpadmovehomeek5ggoq12).serializer().booleanValue()) {
                            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite28 = transitionValuesMaps.write((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite27);
                            if (getnumpadmovehomeek5ggoqWrite28 instanceof getNumPadEqualsEK5gGoQ) {
                                getNumPadEqualsEK5gGoQ getnumpadequalsek5ggoq4 = (getNumPadEqualsEK5gGoQ) getnumpadmovehomeek5ggoqWrite28;
                                String str9 = getnumpadequalsek5ggoq4.serializer;
                                if ("break".equals(str9)) {
                                    return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                                }
                                if ("return".equals(str9)) {
                                    return getnumpadequalsek5ggoq4;
                                }
                            }
                            androidx.transition.TransitionValuesMaps transitionValuesMapsPlaybackStateCompatCustomAction3 = transitionValuesMaps.PlaybackStateCompatCustomAction();
                            for (int i4 = 0; i4 < getnumpaddirectionupek5ggoq4.MediaSessionCompatQueueItem(); i4++) {
                                String strIconCompatParcelizer5 = getnumpaddirectionupek5ggoq4.IconCompatParcelizer(i4).IconCompatParcelizer();
                                transitionValuesMapsPlaybackStateCompatCustomAction3.RemoteActionCompatParcelizer(strIconCompatParcelizer5, transitionValuesMapsPlaybackStateCompatCustomAction2.IconCompatParcelizer(strIconCompatParcelizer5));
                            }
                            transitionValuesMapsPlaybackStateCompatCustomAction3.serializer(getnumpadmovehomeek5ggoq13);
                            transitionValuesMapsPlaybackStateCompatCustomAction2 = transitionValuesMapsPlaybackStateCompatCustomAction3;
                        }
                        return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                    case 30:
                        if (MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.FOR_OF, 3, arrayList, 0) instanceof getNumPadSubtractEK5gGoQ) {
                            return write(new getPageUpEK5gGoQ(transitionValuesMaps, ((getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer(), 2), ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)), ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2)));
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        if (MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.FOR_OF_CONST, 3, arrayList, 0) instanceof getNumPadSubtractEK5gGoQ) {
                            return write(new getPageUpEK5gGoQ(transitionValuesMaps, ((getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer(), 0), ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)), ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2)));
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        if (MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.FOR_OF_LET, 3, arrayList, 0) instanceof getNumPadSubtractEK5gGoQ) {
                            return write(new getPageUpEK5gGoQ(transitionValuesMaps, ((getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer(), 1), ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)), ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2)));
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        read(str);
                        throw null;
                }
            case 5:
                getPasteEK5gGoQ getpasteek5ggoq5 = getPasteEK5gGoQ.ADD;
                int iOrdinal5 = getTvInputComposite2EK5gGoQ.RemoteActionCompatParcelizer(str).ordinal();
                if (iOrdinal5 == 0) {
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite29 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.ADD, 2, arrayList, 0));
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite30 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                    if ((getnumpadmovehomeek5ggoqWrite29 instanceof getNumPadMultiplyEK5gGoQ) || (getnumpadmovehomeek5ggoqWrite29 instanceof getNumPadSubtractEK5gGoQ) || (getnumpadmovehomeek5ggoqWrite30 instanceof getNumPadMultiplyEK5gGoQ) || (getnumpadmovehomeek5ggoqWrite30 instanceof getNumPadSubtractEK5gGoQ)) {
                        return new getNumPadSubtractEK5gGoQ(String.valueOf(getnumpadmovehomeek5ggoqWrite29.IconCompatParcelizer()).concat(String.valueOf(getnumpadmovehomeek5ggoqWrite30.IconCompatParcelizer())));
                    }
                    return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(getnumpadmovehomeek5ggoqWrite30.write().doubleValue() + getnumpadmovehomeek5ggoqWrite29.write().doubleValue()));
                }
                if (iOrdinal5 == 21) {
                    getnumpadleftparenthesisek5ggoq = new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.DIVIDE, 2, arrayList, 0)).write().doubleValue() / ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue()));
                } else if (iOrdinal5 == 59) {
                    getnumpadleftparenthesisek5ggoq = new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.SUBTRACT, 2, arrayList, 0)).write().doubleValue() + (-((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue())));
                } else {
                    if (iOrdinal5 != 52 && iOrdinal5 != 53) {
                        if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                            getTvInputComposite2EK5gGoQ.serializer(arrayList, 1, str);
                            return ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0));
                        }
                        switch (iOrdinal5) {
                            case 44:
                                return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.MODULUS, 2, arrayList, 0)).write().doubleValue() % ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue()));
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue() * ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.MULTIPLY, 2, arrayList, 0)).write().doubleValue()));
                            case 46:
                                return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(-((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.NEGATE, 1, arrayList, 0)).write().doubleValue()));
                            default:
                                read(str);
                                throw null;
                        }
                    }
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 2, str);
                    getnumpadleftparenthesisek5ggoq = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0));
                    transitionValuesMaps.serializer((getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                }
                return getnumpadleftparenthesisek5ggoq;
            case 6:
                if (str == null || str.isEmpty() || !transitionValuesMaps.serializer(str)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Command not found: ", str));
                    return null;
                }
                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqIconCompatParcelizer = transitionValuesMaps.IconCompatParcelizer(str);
                if (getnumpadmovehomeek5ggoqIconCompatParcelizer instanceof getNumPadInsertEK5gGoQ) {
                    return ((getNumPadInsertEK5gGoQ) getnumpadmovehomeek5ggoqIconCompatParcelizer).RemoteActionCompatParcelizer((androidx.transition.TransitionValuesMaps) transitionValuesMaps, arrayList);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Function ", str, " is not defined"));
                return null;
            default:
                getPasteEK5gGoQ getpasteek5ggoq6 = getPasteEK5gGoQ.ADD;
                int iOrdinal6 = getTvInputComposite2EK5gGoQ.RemoteActionCompatParcelizer(str).ordinal();
                if (iOrdinal6 == 3) {
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite31 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.ASSIGN, 2, arrayList, 0));
                    if (!(getnumpadmovehomeek5ggoqWrite31 instanceof getNumPadSubtractEK5gGoQ)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Expected string for assign var. got ", getnumpadmovehomeek5ggoqWrite31.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((getNumPadSubtractEK5gGoQ) getnumpadmovehomeek5ggoqWrite31).write;
                    if (!transitionValuesMaps.serializer(str10)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite32 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                    transitionValuesMaps.RemoteActionCompatParcelizer(str10, getnumpadmovehomeek5ggoqWrite32);
                    return getnumpadmovehomeek5ggoqWrite32;
                }
                if (iOrdinal6 == 14) {
                    getTvInputComposite2EK5gGoQ.read(arrayList, 2, getPasteEK5gGoQ.CONST.name());
                    if (arrayList.size() % 2 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i < arrayList.size() - 1) {
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite33 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(i));
                        if (!(getnumpadmovehomeek5ggoqWrite33 instanceof getNumPadSubtractEK5gGoQ)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Expected string for const name. got ", getnumpadmovehomeek5ggoqWrite33.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((getNumPadSubtractEK5gGoQ) getnumpadmovehomeek5ggoqWrite33).write;
                        transitionValuesMaps.write(str11, ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(i + 1)));
                        ((HashMap) transitionValuesMaps.RatingCompat).put(str11, Boolean.TRUE);
                        i += 2;
                    }
                    return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                }
                if (iOrdinal6 == 24) {
                    getTvInputComposite2EK5gGoQ.read(arrayList, 1, getPasteEK5gGoQ.EXPRESSION_LIST.name());
                    getnumpaddirectionupek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                    while (i < arrayList.size()) {
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite34 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(i));
                        if (getnumpadmovehomeek5ggoqWrite34 instanceof getNumPadEqualsEK5gGoQ) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i++;
                        getnumpaddirectionupek5ggoq = getnumpadmovehomeek5ggoqWrite34;
                    }
                } else {
                    if (iOrdinal6 == 33) {
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite35 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.GET, 1, arrayList, 0));
                        if (getnumpadmovehomeek5ggoqWrite35 instanceof getNumPadSubtractEK5gGoQ) {
                            return transitionValuesMaps.IconCompatParcelizer(((getNumPadSubtractEK5gGoQ) getnumpadmovehomeek5ggoqWrite35).write);
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Expected string for get var. got ", getnumpadmovehomeek5ggoqWrite35.getClass().getCanonicalName()));
                        return null;
                    }
                    if (iOrdinal6 == 49) {
                        getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, getPasteEK5gGoQ.NULL.name());
                        return getNumPadMoveHomeEK5gGoQ.MediaDescriptionCompat;
                    }
                    if (iOrdinal6 == 58) {
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq14 = (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.SET_PROPERTY, 3, arrayList, 0);
                        zzz zzzVar13 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                        zzz zzzVar14 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite36 = zzzVar13.write(transitionValuesMaps, getnumpadmovehomeek5ggoq14);
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite37 = zzzVar14.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite38 = zzzVar14.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(2));
                        if (getnumpadmovehomeek5ggoqWrite36 == getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem || getnumpadmovehomeek5ggoqWrite36 == getNumPadMoveHomeEK5gGoQ.MediaDescriptionCompat) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write(af$$ExternalSyntheticOutline0.m("Can't set property ", getnumpadmovehomeek5ggoqWrite37.IconCompatParcelizer(), " of ", getnumpadmovehomeek5ggoqWrite36.IconCompatParcelizer()));
                            return null;
                        }
                        if ((getnumpadmovehomeek5ggoqWrite36 instanceof getNumPadDirectionUpEK5gGoQ) && (getnumpadmovehomeek5ggoqWrite37 instanceof getNumPadLeftParenthesisEK5gGoQ)) {
                            ((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite36).RemoteActionCompatParcelizer(((getNumPadLeftParenthesisEK5gGoQ) getnumpadmovehomeek5ggoqWrite37).read.intValue(), getnumpadmovehomeek5ggoqWrite38);
                        } else if (getnumpadmovehomeek5ggoqWrite36 instanceof getNumPadMultiplyEK5gGoQ) {
                            ((getNumPadMultiplyEK5gGoQ) getnumpadmovehomeek5ggoqWrite36).RemoteActionCompatParcelizer(getnumpadmovehomeek5ggoqWrite37.IconCompatParcelizer(), getnumpadmovehomeek5ggoqWrite38);
                        }
                        return getnumpadmovehomeek5ggoqWrite38;
                    }
                    if (iOrdinal6 != 17) {
                        if (iOrdinal6 != 18) {
                            if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite39 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.GET_PROPERTY, 2, arrayList, 0));
                                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite40 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                                if ((getnumpadmovehomeek5ggoqWrite39 instanceof getNumPadDirectionUpEK5gGoQ) && getTvInputComposite2EK5gGoQ.write(getnumpadmovehomeek5ggoqWrite40)) {
                                    return ((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite39).IconCompatParcelizer(getnumpadmovehomeek5ggoqWrite40.write().intValue());
                                }
                                if (getnumpadmovehomeek5ggoqWrite39 instanceof getNumPadMultiplyEK5gGoQ) {
                                    return ((getNumPadMultiplyEK5gGoQ) getnumpadmovehomeek5ggoqWrite39).serializer(getnumpadmovehomeek5ggoqWrite40.IconCompatParcelizer());
                                }
                                if (getnumpadmovehomeek5ggoqWrite39 instanceof getNumPadSubtractEK5gGoQ) {
                                    if ("length".equals(getnumpadmovehomeek5ggoqWrite40.IconCompatParcelizer())) {
                                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(((getNumPadSubtractEK5gGoQ) getnumpadmovehomeek5ggoqWrite39).write.length()));
                                    }
                                    if (getTvInputComposite2EK5gGoQ.write(getnumpadmovehomeek5ggoqWrite40)) {
                                        double dDoubleValue = getnumpadmovehomeek5ggoqWrite40.write().doubleValue();
                                        String str12 = ((getNumPadSubtractEK5gGoQ) getnumpadmovehomeek5ggoqWrite39).write;
                                        if (dDoubleValue < str12.length()) {
                                            return new getNumPadSubtractEK5gGoQ(String.valueOf(str12.charAt(getnumpadmovehomeek5ggoqWrite40.write().intValue())));
                                        }
                                    }
                                }
                                return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                            }
                            switch (iOrdinal6) {
                                case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite41 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) MediaSessionCompatQueueItem.serializer(getPasteEK5gGoQ.TYPEOF, 1, arrayList, 0));
                                    if (getnumpadmovehomeek5ggoqWrite41 instanceof getOEK5gGoQ) {
                                        str2 = "undefined";
                                    } else if (getnumpadmovehomeek5ggoqWrite41 instanceof getNumPadEnterEK5gGoQ) {
                                        str2 = "boolean";
                                    } else if (getnumpadmovehomeek5ggoqWrite41 instanceof getNumPadLeftParenthesisEK5gGoQ) {
                                        str2 = "number";
                                    } else if (getnumpadmovehomeek5ggoqWrite41 instanceof getNumPadSubtractEK5gGoQ) {
                                        str2 = "string";
                                    } else if (getnumpadmovehomeek5ggoqWrite41 instanceof getNumPadMoveEndEK5gGoQ) {
                                        str2 = "function";
                                    } else {
                                        if ((getnumpadmovehomeek5ggoqWrite41 instanceof getNumPadRightParenthesisEK5gGoQ) || (getnumpadmovehomeek5ggoqWrite41 instanceof getNumPadEqualsEK5gGoQ)) {
                                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Unsupported value type %s in typeof", new Object[]{getnumpadmovehomeek5ggoqWrite41});
                                            return null;
                                        }
                                        str2 = "object";
                                    }
                                    return new getNumPadSubtractEK5gGoQ(str2);
                                case 63:
                                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, getPasteEK5gGoQ.UNDEFINED.name());
                                    return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                                case 64:
                                    getTvInputComposite2EK5gGoQ.read(arrayList, 1, getPasteEK5gGoQ.VAR.name());
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite42 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) it3.next());
                                        if (!(getnumpadmovehomeek5ggoqWrite42 instanceof getNumPadSubtractEK5gGoQ)) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Expected string for var name. got ", getnumpadmovehomeek5ggoqWrite42.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        transitionValuesMaps.write(((getNumPadSubtractEK5gGoQ) getnumpadmovehomeek5ggoqWrite42).write, getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem);
                                    }
                                    return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                                default:
                                    read(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new getNumPadPageUpEK5gGoQ();
                        }
                        if (arrayList.size() % 2 != 0) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        getnumpaddirectionupek5ggoq = new getNumPadPageUpEK5gGoQ();
                        while (i < arrayList.size() - 1) {
                            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite43 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(i));
                            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite44 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(i + 1));
                            if ((getnumpadmovehomeek5ggoqWrite43 instanceof getNumPadEqualsEK5gGoQ) || (getnumpadmovehomeek5ggoqWrite44 instanceof getNumPadEqualsEK5gGoQ)) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Failed to evaluate map entry");
                                return null;
                            }
                            getnumpaddirectionupek5ggoq.RemoteActionCompatParcelizer(getnumpadmovehomeek5ggoqWrite43.IconCompatParcelizer(), getnumpadmovehomeek5ggoqWrite44);
                            i += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new getNumPadDirectionUpEK5gGoQ();
                        }
                        getnumpaddirectionupek5ggoq = new getNumPadDirectionUpEK5gGoQ();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite45 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) it4.next());
                            if (getnumpadmovehomeek5ggoqWrite45 instanceof getNumPadEqualsEK5gGoQ) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Failed to evaluate array element");
                                return null;
                            }
                            getnumpaddirectionupek5ggoq.RemoteActionCompatParcelizer(i, getnumpadmovehomeek5ggoqWrite45);
                            i++;
                        }
                    }
                }
                return getnumpaddirectionupek5ggoq;
        }
    }

    public static boolean IconCompatParcelizer(getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq2) {
        if (getnumpadmovehomeek5ggoq instanceof getNumPadMultiplyEK5gGoQ) {
            getnumpadmovehomeek5ggoq = new getNumPadSubtractEK5gGoQ(getnumpadmovehomeek5ggoq.IconCompatParcelizer());
        }
        if (getnumpadmovehomeek5ggoq2 instanceof getNumPadMultiplyEK5gGoQ) {
            getnumpadmovehomeek5ggoq2 = new getNumPadSubtractEK5gGoQ(getnumpadmovehomeek5ggoq2.IconCompatParcelizer());
        }
        return (((getnumpadmovehomeek5ggoq instanceof getNumPadSubtractEK5gGoQ) && (getnumpadmovehomeek5ggoq2 instanceof getNumPadSubtractEK5gGoQ)) || !(Double.isNaN(getnumpadmovehomeek5ggoq.write().doubleValue()) || Double.isNaN(getnumpadmovehomeek5ggoq2.write().doubleValue()))) && !serializer(getnumpadmovehomeek5ggoq2, getnumpadmovehomeek5ggoq);
    }

    public static getNumPadMoveEndEK5gGoQ RemoteActionCompatParcelizer(androidx.transition.TransitionValuesMaps transitionValuesMaps, List list) {
        getTvInputComposite2EK5gGoQ.read(list, 2, getPasteEK5gGoQ.FN.name());
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(0));
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite2 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(1));
        if (getnumpadmovehomeek5ggoqWrite2 instanceof getNumPadDirectionUpEK5gGoQ) {
            List listRemoteActionCompatParcelizer = ((getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite2).RemoteActionCompatParcelizer();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new getNumPadMoveEndEK5gGoQ(getnumpadmovehomeek5ggoqWrite.IconCompatParcelizer(), (ArrayList) listRemoteActionCompatParcelizer, arrayList, transitionValuesMaps);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("FN requires an ArrayValue of parameter names found ", getnumpadmovehomeek5ggoqWrite2.getClass().getCanonicalName()));
        return null;
    }

    public static getNumPadMoveHomeEK5gGoQ write(getPageUpEK5gGoQ getpageupek5ggoq, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq2) {
        if (getnumpadmovehomeek5ggoq instanceof Iterable) {
            return serializer(getpageupek5ggoq, ((Iterable) getnumpadmovehomeek5ggoq).iterator(), getnumpadmovehomeek5ggoq2);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-iterable type in for...of loop.");
        return null;
    }
}
