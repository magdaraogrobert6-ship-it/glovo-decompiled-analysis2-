package o;

import com.google.re2j.Parser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetNameFallbackjd {
    public static InputMethodSessioncreateInputConnection11 RemoteActionCompatParcelizer(accessgetValueOverridejd accessgetvalueoverridejd, int i, InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11, InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection12) {
        accessgetValueOverridejd accessgetvalueoverridejd2 = inputMethodSessioncreateInputConnection11.MediaMetadataCompat;
        if (accessgetvalueoverridejd2 == accessgetValueOverridejd.EMPTY_MATCH || (accessgetvalueoverridejd == accessgetvalueoverridejd2 && (i & 32) == (inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer & 32))) {
            return inputMethodSessioncreateInputConnection11;
        }
        if (inputMethodSessioncreateInputConnection12 != null && inputMethodSessioncreateInputConnection12.MediaMetadataCompat == accessgetvalueoverridejd && (inputMethodSessioncreateInputConnection12.RemoteActionCompatParcelizer & 32) == (i & 32) && inputMethodSessioncreateInputConnection11 == inputMethodSessioncreateInputConnection12.MediaBrowserCompatMediaItem[0]) {
            return inputMethodSessioncreateInputConnection12;
        }
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection13 = new InputMethodSessioncreateInputConnection11(accessgetvalueoverridejd);
        inputMethodSessioncreateInputConnection13.RemoteActionCompatParcelizer = i;
        inputMethodSessioncreateInputConnection13.MediaBrowserCompatMediaItem = new InputMethodSessioncreateInputConnection11[]{inputMethodSessioncreateInputConnection11};
        return inputMethodSessioncreateInputConnection13;
    }

    public static InputMethodSessioncreateInputConnection11 write(InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11) {
        ArrayList arrayList;
        if (inputMethodSessioncreateInputConnection11 == null) {
            return null;
        }
        int i = 0;
        switch (InspectableValueDefaultImpls.write[inputMethodSessioncreateInputConnection11.MediaMetadataCompat.ordinal()]) {
            case 1:
            case 2:
            case 3:
                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection12 = inputMethodSessioncreateInputConnection11;
                int i2 = 0;
                while (true) {
                    InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr = inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem;
                    if (i2 >= inputMethodSessioncreateInputConnection11Arr.length) {
                        return inputMethodSessioncreateInputConnection12;
                    }
                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection13 = inputMethodSessioncreateInputConnection11Arr[i2];
                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write = write(inputMethodSessioncreateInputConnection13);
                    if (inputMethodSessioncreateInputConnection12 == inputMethodSessioncreateInputConnection11 && inputMethodSessioncreateInputConnection11Write != inputMethodSessioncreateInputConnection13) {
                        inputMethodSessioncreateInputConnection12 = new InputMethodSessioncreateInputConnection11();
                        inputMethodSessioncreateInputConnection12.MediaMetadataCompat = inputMethodSessioncreateInputConnection11.MediaMetadataCompat;
                        inputMethodSessioncreateInputConnection12.RemoteActionCompatParcelizer = inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer;
                        inputMethodSessioncreateInputConnection12.MediaBrowserCompatMediaItem = inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem;
                        inputMethodSessioncreateInputConnection12.serializer = inputMethodSessioncreateInputConnection11.serializer;
                        inputMethodSessioncreateInputConnection12.IconCompatParcelizer = inputMethodSessioncreateInputConnection11.IconCompatParcelizer;
                        inputMethodSessioncreateInputConnection12.read = inputMethodSessioncreateInputConnection11.read;
                        inputMethodSessioncreateInputConnection12.RatingCompat = inputMethodSessioncreateInputConnection11.RatingCompat;
                        inputMethodSessioncreateInputConnection12.MediaDescriptionCompat = inputMethodSessioncreateInputConnection11.MediaDescriptionCompat;
                        inputMethodSessioncreateInputConnection12.MediaSessionCompatQueueItem = null;
                        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr2 = inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem;
                        inputMethodSessioncreateInputConnection12.MediaBrowserCompatMediaItem = Parser.write(inputMethodSessioncreateInputConnection11Arr2, 0, inputMethodSessioncreateInputConnection11Arr2.length);
                    }
                    if (inputMethodSessioncreateInputConnection12 != inputMethodSessioncreateInputConnection11) {
                        inputMethodSessioncreateInputConnection12.MediaBrowserCompatMediaItem[i2] = inputMethodSessioncreateInputConnection11Write;
                    }
                    i2++;
                }
                break;
            case 4:
            case 5:
            case 6:
                return RemoteActionCompatParcelizer(inputMethodSessioncreateInputConnection11.MediaMetadataCompat, inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer, write(inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[0]), inputMethodSessioncreateInputConnection11);
            case 7:
                if (inputMethodSessioncreateInputConnection11.serializer == 0 && inputMethodSessioncreateInputConnection11.IconCompatParcelizer == 0) {
                    return new InputMethodSessioncreateInputConnection11(accessgetValueOverridejd.EMPTY_MATCH);
                }
                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write2 = write(inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[0]);
                int i3 = inputMethodSessioncreateInputConnection11.IconCompatParcelizer;
                int i4 = inputMethodSessioncreateInputConnection11.serializer;
                if (i3 == -1) {
                    if (i4 == 0) {
                        return RemoteActionCompatParcelizer(accessgetValueOverridejd.STAR, inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer, inputMethodSessioncreateInputConnection11Write2, null);
                    }
                    if (i4 == 1) {
                        return RemoteActionCompatParcelizer(accessgetValueOverridejd.PLUS, inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer, inputMethodSessioncreateInputConnection11Write2, null);
                    }
                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection14 = new InputMethodSessioncreateInputConnection11(accessgetValueOverridejd.CONCAT);
                    ArrayList arrayList2 = new ArrayList();
                    while (i < inputMethodSessioncreateInputConnection11.serializer - 1) {
                        arrayList2.add(inputMethodSessioncreateInputConnection11Write2);
                        i++;
                    }
                    arrayList2.add(RemoteActionCompatParcelizer(accessgetValueOverridejd.PLUS, inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer, inputMethodSessioncreateInputConnection11Write2, null));
                    inputMethodSessioncreateInputConnection14.MediaBrowserCompatMediaItem = (InputMethodSessioncreateInputConnection11[]) arrayList2.toArray(new InputMethodSessioncreateInputConnection11[arrayList2.size()]);
                    return inputMethodSessioncreateInputConnection14;
                }
                if (i4 == 1 && i3 == 1) {
                    return inputMethodSessioncreateInputConnection11Write2;
                }
                if (i4 > 0) {
                    arrayList = new ArrayList();
                    while (i < inputMethodSessioncreateInputConnection11.serializer) {
                        arrayList.add(inputMethodSessioncreateInputConnection11Write2);
                        i++;
                    }
                } else {
                    arrayList = null;
                }
                if (inputMethodSessioncreateInputConnection11.IconCompatParcelizer > inputMethodSessioncreateInputConnection11.serializer) {
                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(accessgetValueOverridejd.QUEST, inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer, inputMethodSessioncreateInputConnection11Write2, null);
                    for (int i5 = inputMethodSessioncreateInputConnection11.serializer + 1; i5 < inputMethodSessioncreateInputConnection11.IconCompatParcelizer; i5++) {
                        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection15 = new InputMethodSessioncreateInputConnection11(accessgetValueOverridejd.CONCAT);
                        inputMethodSessioncreateInputConnection15.MediaBrowserCompatMediaItem = new InputMethodSessioncreateInputConnection11[]{inputMethodSessioncreateInputConnection11Write2, inputMethodSessioncreateInputConnection11RemoteActionCompatParcelizer};
                        inputMethodSessioncreateInputConnection11RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(accessgetValueOverridejd.QUEST, inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer, inputMethodSessioncreateInputConnection15, null);
                    }
                    if (arrayList == null) {
                        return inputMethodSessioncreateInputConnection11RemoteActionCompatParcelizer;
                    }
                    arrayList.add(inputMethodSessioncreateInputConnection11RemoteActionCompatParcelizer);
                }
                if (arrayList != null) {
                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection16 = new InputMethodSessioncreateInputConnection11(accessgetValueOverridejd.CONCAT);
                    inputMethodSessioncreateInputConnection16.MediaBrowserCompatMediaItem = (InputMethodSessioncreateInputConnection11[]) arrayList.toArray(new InputMethodSessioncreateInputConnection11[arrayList.size()]);
                    return inputMethodSessioncreateInputConnection16;
                }
                return new InputMethodSessioncreateInputConnection11(accessgetValueOverridejd.NO_MATCH);
            default:
                return inputMethodSessioncreateInputConnection11;
        }
    }
}
