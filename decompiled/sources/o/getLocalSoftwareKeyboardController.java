package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getLocalSoftwareKeyboardController {
    public static void IconCompatParcelizer(DefaultHapticFeedback defaultHapticFeedback, Map.Entry entry) {
        CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = (CompositionLocalsKtLocalLocale1) entry.getKey();
        if (compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem()) {
            switch (getLocalTextInputServiceannotations.read[compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().ordinal()]) {
                case 1:
                    registerProvider.serializer(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 2:
                    registerProvider.RatingCompat(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 3:
                    registerProvider.MediaSessionCompatQueueItem(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 4:
                    registerProvider.PlaybackStateCompatCustomAction(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 5:
                    registerProvider.MediaMetadataCompat(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 6:
                    registerProvider.read(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 7:
                    registerProvider.write(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 8:
                    registerProvider.RemoteActionCompatParcelizer(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 9:
                    registerProvider.MediaSessionCompatToken(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 10:
                    registerProvider.MediaDescriptionCompat(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 11:
                    registerProvider.MediaBrowserCompatMediaItem(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 12:
                    registerProvider.ParcelableVolumeInfo(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 13:
                    registerProvider.MediaSessionCompatResultReceiverWrapper(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 14:
                    registerProvider.MediaMetadataCompat(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, compositionLocalsKtLocalLocale1.serializer());
                    break;
                case 15:
                    registerProvider.write(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback);
                    break;
                case 16:
                    registerProvider.RemoteActionCompatParcelizer(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        registerProvider.IconCompatParcelizer(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, component26.IconCompatParcelizer.read(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        registerProvider.RemoteActionCompatParcelizer(compositionLocalsKtLocalLocale1.write(), (List) entry.getValue(), defaultHapticFeedback, component26.IconCompatParcelizer.read(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (getLocalTextInputServiceannotations.read[compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer().ordinal()]) {
            case 1:
                int iWrite = compositionLocalsKtLocalLocale1.write();
                double dDoubleValue = ((Double) entry.getValue()).doubleValue();
                ComposeView composeView = (ComposeView) defaultHapticFeedback.write;
                composeView.getClass();
                composeView.RemoteActionCompatParcelizer(iWrite, Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                int iWrite2 = compositionLocalsKtLocalLocale1.write();
                float fFloatValue = ((Float) entry.getValue()).floatValue();
                ComposeView composeView2 = (ComposeView) defaultHapticFeedback.write;
                composeView2.getClass();
                composeView2.read(iWrite2, Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                defaultHapticFeedback.IconCompatParcelizer(compositionLocalsKtLocalLocale1.write(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((ComposeView) defaultHapticFeedback.write).write(compositionLocalsKtLocalLocale1.write(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                defaultHapticFeedback.serializer(compositionLocalsKtLocalLocale1.write(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                defaultHapticFeedback.serializer(compositionLocalsKtLocalLocale1.write(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                defaultHapticFeedback.read(compositionLocalsKtLocalLocale1.write(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((ComposeView) defaultHapticFeedback.write).RemoteActionCompatParcelizer(compositionLocalsKtLocalLocale1.write(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((ComposeView) defaultHapticFeedback.write).IconCompatParcelizer(compositionLocalsKtLocalLocale1.write(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((ComposeView) defaultHapticFeedback.write).read(compositionLocalsKtLocalLocale1.write(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((ComposeView) defaultHapticFeedback.write).RemoteActionCompatParcelizer(compositionLocalsKtLocalLocale1.write(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                int iWrite3 = compositionLocalsKtLocalLocale1.write();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                ((ComposeView) defaultHapticFeedback.write).IconCompatParcelizer(iWrite3, (iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case 13:
                int iWrite4 = compositionLocalsKtLocalLocale1.write();
                long jLongValue = ((Long) entry.getValue()).longValue();
                ((ComposeView) defaultHapticFeedback.write).write(iWrite4, (jLongValue << 1) ^ (jLongValue >> 63));
                break;
            case 14:
                defaultHapticFeedback.serializer(compositionLocalsKtLocalLocale1.write(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                defaultHapticFeedback.IconCompatParcelizer(compositionLocalsKtLocalLocale1.write(), (getClipMetadata) entry.getValue());
                break;
            case 16:
                ((ComposeView) defaultHapticFeedback.write).write(compositionLocalsKtLocalLocale1.write(), (String) entry.getValue());
                break;
            case 17:
                defaultHapticFeedback.write(compositionLocalsKtLocalLocale1.write(), entry.getValue(), component26.IconCompatParcelizer.read(entry.getValue().getClass()));
                break;
            case 18:
                defaultHapticFeedback.read(compositionLocalsKtLocalLocale1.write(), entry.getValue(), component26.IconCompatParcelizer.read(entry.getValue().getClass()));
                break;
        }
    }

    public static Object serializer(Object obj, com.google.protobuf.CodedInputStreamReader codedInputStreamReader, CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress, CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1, Object obj2, com.google.protobuf.UnknownFieldSchema unknownFieldSchema) throws com.google.protobuf.InvalidProtocolBufferException {
        Object objValueOf;
        Object obj3;
        ArrayList arrayList;
        int iRemoteActionCompatParcelizer = compositionLocalsKtLocalProvidableScrollCaptureInProgress1.RemoteActionCompatParcelizer();
        CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = compositionLocalsKtLocalProvidableScrollCaptureInProgress1.write;
        if (compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem() && compositionLocalsKtLocalLocale1.serializer()) {
            switch (getLocalTextInputServiceannotations.read[compositionLocalsKtLocalProvidableScrollCaptureInProgress1.read().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    codedInputStreamReader.IconCompatParcelizer(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    codedInputStreamReader.MediaBrowserCompatMediaItem(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    codedInputStreamReader.MediaMetadataCompat(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    codedInputStreamReader.MediaSessionCompatToken(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    codedInputStreamReader.MediaSessionCompatQueueItem(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    codedInputStreamReader.MediaDescriptionCompat(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    codedInputStreamReader.read(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    codedInputStreamReader.RemoteActionCompatParcelizer(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    codedInputStreamReader.PlaybackStateCompatCustomAction(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    codedInputStreamReader.RatingCompat(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    codedInputStreamReader.ParcelableVolumeInfo(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    codedInputStreamReader.PlaybackStateCompat(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    codedInputStreamReader.MediaSessionCompatResultReceiverWrapper(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    codedInputStreamReader.write(arrayList);
                    obj2 = registerProvider.read(obj, iRemoteActionCompatParcelizer, arrayList, compositionLocalsKtLocalLocale1.read(), obj2, unknownFieldSchema);
                    break;
                default:
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer(), "Type cannot be packed: ");
                    return null;
            }
            compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, arrayList);
            return obj2;
        }
        if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1.read() != onScroll.ENUM) {
            switch (getLocalTextInputServiceannotations.read[compositionLocalsKtLocalProvidableScrollCaptureInProgress1.read().ordinal()]) {
                case 1:
                    codedInputStreamReader.IconCompatParcelizer(1);
                    objValueOf = Double.valueOf(codedInputStreamReader.serializer.MediaMetadataCompat());
                    break;
                case 2:
                    codedInputStreamReader.IconCompatParcelizer(5);
                    objValueOf = Float.valueOf(codedInputStreamReader.serializer.MediaSessionCompatResultReceiverWrapper());
                    break;
                case 3:
                    codedInputStreamReader.IconCompatParcelizer(0);
                    objValueOf = Long.valueOf(codedInputStreamReader.serializer.PlaybackStateCompatCustomAction());
                    break;
                case 4:
                    codedInputStreamReader.IconCompatParcelizer(0);
                    objValueOf = Long.valueOf(codedInputStreamReader.serializer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
                    break;
                case 5:
                    codedInputStreamReader.IconCompatParcelizer(0);
                    objValueOf = Integer.valueOf(codedInputStreamReader.serializer.ParcelableVolumeInfo());
                    break;
                case 6:
                    codedInputStreamReader.IconCompatParcelizer(1);
                    objValueOf = Long.valueOf(codedInputStreamReader.serializer.MediaDescriptionCompat());
                    break;
                case 7:
                    codedInputStreamReader.IconCompatParcelizer(5);
                    objValueOf = Integer.valueOf(codedInputStreamReader.serializer.RatingCompat());
                    break;
                case 8:
                    codedInputStreamReader.IconCompatParcelizer(0);
                    objValueOf = Boolean.valueOf(codedInputStreamReader.serializer.serializer());
                    break;
                case 9:
                    codedInputStreamReader.IconCompatParcelizer(0);
                    objValueOf = Integer.valueOf(codedInputStreamReader.serializer.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
                    break;
                case 10:
                    codedInputStreamReader.IconCompatParcelizer(5);
                    objValueOf = Integer.valueOf(codedInputStreamReader.serializer.PlaybackStateCompat());
                    break;
                case 11:
                    codedInputStreamReader.IconCompatParcelizer(1);
                    objValueOf = Long.valueOf(codedInputStreamReader.serializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
                    break;
                case 12:
                    codedInputStreamReader.IconCompatParcelizer(0);
                    objValueOf = Integer.valueOf(codedInputStreamReader.serializer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                    break;
                case 13:
                    codedInputStreamReader.IconCompatParcelizer(0);
                    objValueOf = Long.valueOf(codedInputStreamReader.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                    break;
                case 14:
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Shouldn't reach here.");
                    return null;
                case 15:
                    objValueOf = codedInputStreamReader.write();
                    break;
                case 16:
                    codedInputStreamReader.IconCompatParcelizer(2);
                    objValueOf = codedInputStreamReader.serializer.ComponentActivity();
                    break;
                case 17:
                    if (!compositionLocalsKtLocalProvidableScrollCaptureInProgress1.write()) {
                        Object obj4 = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalLocale1);
                        if (obj4 instanceof GeneratedMessageLite) {
                            component26 component26Var = component26.IconCompatParcelizer;
                            component26Var.getClass();
                            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0 = component26Var.read(obj4.getClass());
                            if (!((GeneratedMessageLite) obj4).isMutable()) {
                                Object obj5 = disposableSaveableStateRegistrylambda0.read();
                                disposableSaveableStateRegistrylambda0.read(obj5, obj4);
                                compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, obj5);
                                obj4 = obj5;
                            }
                            codedInputStreamReader.IconCompatParcelizer(3);
                            codedInputStreamReader.read(obj4, disposableSaveableStateRegistrylambda0, getlocalprovidablescrollcaptureinprogress);
                            return obj2;
                        }
                    }
                    Class<?> cls = compositionLocalsKtLocalProvidableScrollCaptureInProgress1.serializer().getClass();
                    codedInputStreamReader.IconCompatParcelizer(3);
                    DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda1 = component26.IconCompatParcelizer.read(cls);
                    Object obj6 = disposableSaveableStateRegistrylambda1.read();
                    codedInputStreamReader.read(obj6, disposableSaveableStateRegistrylambda1, getlocalprovidablescrollcaptureinprogress);
                    disposableSaveableStateRegistrylambda1.read(obj6);
                    objValueOf = obj6;
                    break;
                case 18:
                    if (!compositionLocalsKtLocalProvidableScrollCaptureInProgress1.write()) {
                        Object obj7 = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalLocale1);
                        if (obj7 instanceof GeneratedMessageLite) {
                            component26 component26Var2 = component26.IconCompatParcelizer;
                            component26Var2.getClass();
                            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda2 = component26Var2.read(obj7.getClass());
                            if (!((GeneratedMessageLite) obj7).isMutable()) {
                                Object obj8 = disposableSaveableStateRegistrylambda2.read();
                                disposableSaveableStateRegistrylambda2.read(obj8, obj7);
                                compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, obj8);
                                obj7 = obj8;
                            }
                            codedInputStreamReader.IconCompatParcelizer(2);
                            codedInputStreamReader.IconCompatParcelizer(obj7, disposableSaveableStateRegistrylambda2, getlocalprovidablescrollcaptureinprogress);
                            return obj2;
                        }
                    }
                    objValueOf = codedInputStreamReader.RemoteActionCompatParcelizer(compositionLocalsKtLocalProvidableScrollCaptureInProgress1.serializer().getClass(), getlocalprovidablescrollcaptureinprogress);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            codedInputStreamReader.IconCompatParcelizer(0);
            int iParcelableVolumeInfo = codedInputStreamReader.serializer.ParcelableVolumeInfo();
            if (compositionLocalsKtLocalLocale1.read().IconCompatParcelizer(iParcelableVolumeInfo) == null) {
                return registerProvider.RemoteActionCompatParcelizer(obj, iRemoteActionCompatParcelizer, iParcelableVolumeInfo, obj2, unknownFieldSchema);
            }
            objValueOf = Integer.valueOf(iParcelableVolumeInfo);
        }
        if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1.write()) {
            compositionLocalsKtLocalClipboard1.write(compositionLocalsKtLocalLocale1, objValueOf);
            return obj2;
        }
        int i = getLocalTextInputServiceannotations.read[compositionLocalsKtLocalProvidableScrollCaptureInProgress1.read().ordinal()];
        if ((i == 17 || i == 18) && (obj3 = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalLocale1)) != null) {
            getElevation getelevation = (getElevation) objValueOf;
            CompositionLocalsKtLocalHapticFeedback1 compositionLocalsKtLocalHapticFeedback1 = (CompositionLocalsKtLocalHapticFeedback1) ((getElevation) obj3).toBuilder();
            if (!compositionLocalsKtLocalHapticFeedback1.write.getClass().isInstance(getelevation)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("mergeFrom(MessageLite) can only merge messages of the same type.");
                return null;
            }
            compositionLocalsKtLocalHapticFeedback1.read((GeneratedMessageLite) ((AbstractMessageLite) getelevation));
            objValueOf = compositionLocalsKtLocalHapticFeedback1.read();
        }
        compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalLocale1, objValueOf);
        return obj2;
    }
}
