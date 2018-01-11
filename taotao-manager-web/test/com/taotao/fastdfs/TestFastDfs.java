package com.taotao.fastdfs;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

/**
 * 测试fastdfs
 * @author jun
 *
 */

public class TestFastDfs {
	@Test
	public void uploadFile() throws Exception{
		/**
		 * 1、加载配置文件，配置文件中的内容就是tracker服务的地址。
		 *	配置文件内容：tracker_server=192.168.25.133:22122
		 *  2、创建一个TrackerClient对象。直接new一个。
		 *	3、使用TrackerClient对象创建连接，获得一个TrackerServer对象。
		 *	4、创建一个StorageServer的引用，值为null
		 *	5、创建一个StorageClient对象，需要两个参数TrackerServer对象、StorageServer的引用
		 *	6、使用StorageClient对象上传图片。
		 *	7、返回数组。包含组名和图片的路径。

		 */
		
		// 1、加载配置文件，配置文件中的内容就是tracker服务的地址。
				ClientGlobal.init("D:/git/taotao/taotao-manager-web/src/main/resources/resource/client.conf");
				// 2、创建一个TrackerClient对象。直接new一个。
				TrackerClient trackerClient = new TrackerClient();
				// 3、使用TrackerClient对象创建连接，获得一个TrackerServer对象。
				TrackerServer trackerServer = trackerClient.getConnection();
				// 4、创建一个StorageServer的引用，值为null
				StorageServer storageServer = null;
				// 5、创建一个StorageClient对象，需要两个参数TrackerServer对象、StorageServer的引用
				StorageClient storageClient = new StorageClient(trackerServer, storageServer);
				// 6、使用StorageClient对象上传图片。
				//扩展名不带“.”
				String[] strings = storageClient.upload_file("D:/01.jpg", "jpg", null);
				// 7、返回数组。包含组名和图片的路径。
				for (String string : strings) {
					System.out.println(string);
				}

	}
}
