package org.bouncycastle.util.encoders;

import io.socket.parser.IOParser$Decoder;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Hex {
    public static final IOParser$Decoder read = new IOParser$Decoder(24);

    public static byte[] read(String str) {
        try {
            return read.serializer(str.length(), str);
        } catch (Exception e) {
            DecoderException decoderException = new DecoderException(MediaSessionCompatQueueItem.read(e, new StringBuilder("exception decoding Hex string: ")));
            decoderException.write = e;
            throw decoderException;
        }
    }
}
