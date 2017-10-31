package org.ctlv.proxmox.tester;

import java.io.IOException;
import java.util.List;

import javax.security.auth.login.LoginException;

import org.ctlv.proxmox.api.ProxmoxAPI;
import org.ctlv.proxmox.api.data.LXC;
import org.json.JSONException;
import org.ctlv.proxmox.api.Constants;
import com.sun.corba.se.impl.orbutil.closure.Constant;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import org.ctlv.proxmox.api.data.Node;

public class Main {

	public static void main(String[] args) throws LoginException, JSONException, IOException {

		ProxmoxAPI api = new ProxmoxAPI();		
		
//		//List all the nodes 
//		List<String> nodeStringList = api.getNodes();
//		for(String nodeString : nodeStringList ) {
//			System.out.println(nodeString);
//			Node noeud = api.getNode(nodeString);
//			System.out.println("Noeud : "+nodeString+ " %cpu :" + noeud.getCpu());
//			System.out.println("%cpu : " + noeud.getCpu());
//			float memoryUsed=(float)noeud.getMemory_used()/(float)noeud.getMemory_total();
//			System.out.println("%UsedMemory : "+ memoryUsed);
//		}
		
		int ctNumber=52;
		int ctId=(int)Constants.CT_BASE_ID+ctNumber;
		
		// Creating a container
//		String containerName= Constants.CT_BASE_NAME+ctNumber;
//		System.out.println(Constants.SERVER1+" "+Integer.toString(ctId)+" "+containerName+" "+Constants.RAM_SIZE[0]);
//		api.createCT(Constants.SERVER1,Integer.toString(ctId), containerName, Constants.RAM_SIZE[0]);
		
		//Run Container
//		api.startCT(Constants.SERVER1, Integer.toString(ctId));
//		api.stopCT(Constants.SERVER1, Integer.toString(ctId));
		
//		LXC container = api.getCT(Constants.SERVER1, Integer.toString(ctId));
//		System.out.println(container);
		
		List<LXC> cts = api.getCTs("srv-px5");
		for (LXC lxc : cts) {
			System.out.println(lxc);
		}
		
	}

}
