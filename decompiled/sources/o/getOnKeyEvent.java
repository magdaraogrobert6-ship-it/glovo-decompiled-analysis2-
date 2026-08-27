package o;

import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getOnKeyEvent {
    public static int IconCompatParcelizer(byte[] bArr, int i, onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) onpostflingrz2iavysuspendimpl;
        int iWrite = write(bArr, i, ismetapressedzmokqxo);
        int i2 = ismetapressedzmokqxo.serializer + iWrite;
        while (iWrite < i2) {
            iWrite = write(bArr, iWrite, ismetapressedzmokqxo);
            nestedScrollConnection.write(ismetapressedzmokqxo.serializer);
        }
        if (iWrite == i2) {
            return iWrite;
        }
        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int RemoteActionCompatParcelizer(int i, byte[] bArr, int i2, int i3, onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        NestedScrollConnection nestedScrollConnection = (NestedScrollConnection) onpostflingrz2iavysuspendimpl;
        int iWrite = write(bArr, i2, ismetapressedzmokqxo);
        nestedScrollConnection.write(ismetapressedzmokqxo.serializer);
        while (iWrite < i3) {
            int iWrite2 = write(bArr, iWrite, ismetapressedzmokqxo);
            if (i != ismetapressedzmokqxo.serializer) {
                break;
            }
            iWrite = write(bArr, iWrite2, ismetapressedzmokqxo);
            nestedScrollConnection.write(ismetapressedzmokqxo.serializer);
        }
        return iWrite;
    }

    public static int serializer(Object obj, getDispatcher getdispatcher, byte[] bArr, int i, int i2, int i3, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        getNestedScrollNodeui getnestedscrollnodeui = (getNestedScrollNodeui) getdispatcher;
        int i4 = ismetapressedzmokqxo.IconCompatParcelizer + 1;
        ismetapressedzmokqxo.IconCompatParcelizer = i4;
        if (i4 >= 100) {
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iWrite = getnestedscrollnodeui.write(obj, bArr, i, i2, i3, ismetapressedzmokqxo);
        ismetapressedzmokqxo.IconCompatParcelizer--;
        ismetapressedzmokqxo.read = obj;
        return iWrite;
    }

    public static int serializer(Object obj, getDispatcher getdispatcher, byte[] bArr, int i, int i2, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        int iWrite = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iWrite = write(i3, bArr, iWrite, ismetapressedzmokqxo);
            i3 = ismetapressedzmokqxo.serializer;
        }
        int i4 = iWrite;
        if (i3 < 0 || i3 > i2 - i4) {
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = ismetapressedzmokqxo.IconCompatParcelizer + 1;
        ismetapressedzmokqxo.IconCompatParcelizer = i5;
        if (i5 >= 100) {
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i3 + i4;
        getdispatcher.read(obj, bArr, i4, i6, ismetapressedzmokqxo);
        ismetapressedzmokqxo.IconCompatParcelizer--;
        ismetapressedzmokqxo.read = obj;
        return i6;
    }

    public static int write(byte[] bArr, int i, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return write(b, bArr, i2, ismetapressedzmokqxo);
        }
        ismetapressedzmokqxo.serializer = b;
        return i2;
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr, int i, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        int iWrite = write(bArr, i, ismetapressedzmokqxo);
        int i2 = ismetapressedzmokqxo.serializer;
        if (i2 < 0) {
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iWrite) {
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            ismetapressedzmokqxo.read = onPreviewKeyEvent.IconCompatParcelizer;
            return iWrite;
        }
        ismetapressedzmokqxo.read = onPreviewKeyEvent.IconCompatParcelizer(bArr, iWrite, i2);
        return iWrite + i2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[PHI: r5
  0x0099: PHI (r5v9 byte) = (r5v8 byte), (r5v12 byte) binds: [B:45:0x0094, B:47:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:91:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b1 A[SYNTHETIC] */
    public static int read(byte[] bArr, int i, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        int i2;
        int iWrite = write(bArr, i, ismetapressedzmokqxo);
        int i3 = ismetapressedzmokqxo.serializer;
        if (i3 < 0) {
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i3 == 0) {
            ismetapressedzmokqxo.read = "";
            return iWrite;
        }
        int i4 = updateDispatcher.RemoteActionCompatParcelizer;
        int length = bArr.length;
        if ((((length - iWrite) - i3) | iWrite | i3) < 0) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iWrite), Integer.valueOf(i3)});
            return 0;
        }
        int i5 = iWrite + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (iWrite < i5) {
            byte b = bArr[iWrite];
            if (b < 0) {
                break;
            }
            iWrite++;
            cArr[i6] = (char) b;
            i6++;
        }
        while (iWrite < i5) {
            int i7 = iWrite + 1;
            byte b2 = bArr[iWrite];
            if (b2 >= 0) {
                cArr[i6] = (char) b2;
                i6++;
                iWrite = i7;
                while (iWrite < i5) {
                    byte b3 = bArr[iWrite];
                    if (b3 < 0) {
                        break;
                    }
                    iWrite++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
            } else if (b2 >= -32) {
                if (b2 < -16) {
                    if (i7 >= i5 - 1) {
                        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    byte b4 = bArr[i7];
                    i2 = iWrite + 3;
                    byte b5 = bArr[iWrite + 2];
                    if (!getFrameView.write(b4)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!getFrameView.write(b5)) {
                                    cArr[i6] = (char) ((b5 & 63) | ((b4 & 63) << 6) | ((b2 & 15) << 12));
                                    i6++;
                                }
                            } else if (b4 < -96) {
                                b2 = -19;
                                if (!getFrameView.write(b5)) {
                                    cArr[i6] = (char) ((b5 & 63) | ((b4 & 63) << 6) | ((b2 & 15) << 12));
                                    i6++;
                                }
                            }
                        } else if (b4 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!getFrameView.write(b5)) {
                                    cArr[i6] = (char) ((b5 & 63) | ((b4 & 63) << 6) | ((b2 & 15) << 12));
                                    i6++;
                                }
                            } else if (b4 < -96) {
                                b2 = -19;
                                if (!getFrameView.write(b5)) {
                                    cArr[i6] = (char) ((b5 & 63) | ((b4 & 63) << 6) | ((b2 & 15) << 12));
                                    i6++;
                                }
                            }
                        }
                    }
                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had invalid UTF-8.");
                    return 0;
                }
                if (i7 >= i5 - 2) {
                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had invalid UTF-8.");
                    return 0;
                }
                byte b6 = bArr[i7];
                byte b7 = bArr[iWrite + 2];
                i2 = iWrite + 4;
                byte b8 = bArr[iWrite + 3];
                if (getFrameView.write(b6) || (((b6 + 112) + (b2 << 28)) >> 30) != 0 || getFrameView.write(b7) || getFrameView.write(b8)) {
                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had invalid UTF-8.");
                    return 0;
                }
                int i8 = (b8 & 63) | ((b6 & 63) << 12) | ((b2 & 7) << 18) | ((b7 & 63) << 6);
                cArr[i6] = (char) ((i8 >>> 10) + 55232);
                cArr[i6 + 1] = (char) ((i8 & 1023) + 56320);
                i6 += 2;
                iWrite = i2;
            } else {
                if (i7 >= i5) {
                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had invalid UTF-8.");
                    return 0;
                }
                iWrite += 2;
                byte b9 = bArr[i7];
                if (b2 < -62 || getFrameView.write(b9)) {
                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had invalid UTF-8.");
                    return 0;
                }
                cArr[i6] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i6++;
            }
        }
        ismetapressedzmokqxo.read = new String(cArr, 0, i6);
        return i5;
    }

    public static int IconCompatParcelizer(int i, byte[] bArr, int i2, int i3, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        if ((i >>> 3) == 0) {
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return serializer(bArr, i2, ismetapressedzmokqxo);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return write(bArr, i2, ismetapressedzmokqxo) + ismetapressedzmokqxo.serializer;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = write(bArr, i2, ismetapressedzmokqxo);
            i6 = ismetapressedzmokqxo.serializer;
            if (i6 == i5) {
                break;
            }
            i2 = IconCompatParcelizer(i6, bArr, i2, i3, ismetapressedzmokqxo);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Failed to parse the message.");
        return 0;
    }

    public static long read(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int write(int i, byte[] bArr, int i2, int i3, NestedScrollNode nestedScrollNode, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        int iWrite = i2;
        if ((i >>> 3) == 0) {
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iSerializer = serializer(bArr, iWrite, ismetapressedzmokqxo);
            nestedScrollNode.IconCompatParcelizer(i, Long.valueOf(ismetapressedzmokqxo.write));
            return iSerializer;
        }
        if (i4 == 1) {
            nestedScrollNode.IconCompatParcelizer(i, Long.valueOf(read(iWrite, bArr)));
            return iWrite + 8;
        }
        if (i4 == 2) {
            int iWrite2 = write(bArr, iWrite, ismetapressedzmokqxo);
            int i5 = ismetapressedzmokqxo.serializer;
            if (i5 >= 0) {
                if (i5 > bArr.length - iWrite2) {
                    GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return 0;
                }
                if (i5 == 0) {
                    nestedScrollNode.IconCompatParcelizer(i, onPreviewKeyEvent.IconCompatParcelizer);
                } else {
                    nestedScrollNode.IconCompatParcelizer(i, onPreviewKeyEvent.IconCompatParcelizer(bArr, iWrite2, i5));
                }
                return iWrite2 + i5;
            }
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                nestedScrollNode.IconCompatParcelizer(i, Integer.valueOf(RemoteActionCompatParcelizer(iWrite, bArr)));
                return iWrite + 4;
            }
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        NestedScrollNode nestedScrollNode2 = NestedScrollNode.read();
        int i7 = ismetapressedzmokqxo.IconCompatParcelizer + 1;
        ismetapressedzmokqxo.IconCompatParcelizer = i7;
        if (i7 < 100) {
            int i8 = 0;
            while (iWrite < i3) {
                int iWrite3 = write(bArr, iWrite, ismetapressedzmokqxo);
                int i9 = ismetapressedzmokqxo.serializer;
                if (i9 == i6) {
                    iWrite = iWrite3;
                    i8 = i9;
                    break;
                }
                iWrite = write(i9, bArr, iWrite3, i3, nestedScrollNode2, ismetapressedzmokqxo);
                i8 = i9;
            }
            ismetapressedzmokqxo.IconCompatParcelizer--;
            if (iWrite <= i3 && i8 == i6) {
                nestedScrollNode.IconCompatParcelizer(i, nestedScrollNode2);
                return iWrite;
            }
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Failed to parse the message.");
            return 0;
        }
        GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static int RemoteActionCompatParcelizer(int i, byte[] bArr) {
        byte b = bArr[i];
        return ((bArr[i + 3] & 255) << 24) | ((bArr[i + 1] & 255) << 8) | (b & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static int RemoteActionCompatParcelizer(getDispatcher getdispatcher, int i, byte[] bArr, int i2, int i3, onPostFlingRZ2iAVYsuspendImpl onpostflingrz2iavysuspendimpl, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer = getdispatcher.RemoteActionCompatParcelizer();
        int iSerializer = serializer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer, getdispatcher, bArr, i2, i3, ismetapressedzmokqxo);
        getdispatcher.IconCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer);
        ismetapressedzmokqxo.read = softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer;
        onpostflingrz2iavysuspendimpl.add(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer);
        while (iSerializer < i3) {
            int iWrite = write(bArr, iSerializer, ismetapressedzmokqxo);
            if (i != ismetapressedzmokqxo.serializer) {
                break;
            }
            SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2 = getdispatcher.RemoteActionCompatParcelizer();
            int iSerializer2 = serializer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2, getdispatcher, bArr, iWrite, i3, ismetapressedzmokqxo);
            getdispatcher.IconCompatParcelizer(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2);
            ismetapressedzmokqxo.read = softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2;
            onpostflingrz2iavysuspendimpl.add(softwareKeyboardInterceptionModifierKtRemoteActionCompatParcelizer2);
            iSerializer = iSerializer2;
        }
        return iSerializer;
    }

    public static int serializer(byte[] bArr, int i, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            ismetapressedzmokqxo.write = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & 127)) << i4;
            i3++;
        }
        ismetapressedzmokqxo.write = j2;
        return i3;
    }

    public static int write(int i, byte[] bArr, int i2, isMetaPressedZmokQxo ismetapressedzmokqxo) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            ismetapressedzmokqxo.serializer = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            ismetapressedzmokqxo.serializer = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            ismetapressedzmokqxo.serializer = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            ismetapressedzmokqxo.serializer = i9 | (b4 << 28);
            return i10;
        }
        while (true) {
            int i11 = i10 + 1;
            if (bArr[i10] >= 0) {
                ismetapressedzmokqxo.serializer = i9 | ((b4 & 127) << 28);
                return i11;
            }
            i10 = i11;
        }
    }
}
