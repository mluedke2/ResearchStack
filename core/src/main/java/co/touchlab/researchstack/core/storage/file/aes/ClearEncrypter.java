package co.touchlab.researchstack.core.storage.file.aes;
/**
 * Created by bradleymcdermott on 1/26/16.
 */
public class ClearEncrypter implements Encrypter
{
    @Override
    public byte[] encrypt(byte[] data)
    {
        return data;
    }

    @Override
    public byte[] decrypt(byte[] data)
    {
        return data;
    }
}
