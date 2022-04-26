package main;

import java.util.ArrayList;

// import arvore.Arvore;
import grafo.Aresta;
import grafo.Grafo;
import grafo.Vertice;

public class Main {

	public static void main(String[] args) {
		
		// Arvore arvore = new Arvore(500, "raiz");
		
		// arvore.Inserir(1, "no 1");
		// arvore.Inserir(35, "no 35");
		// arvore.Inserir(3, "no 3");
		// arvore.Inserir(44, "no 44");
		// arvore.Inserir(10, "no 10");
		// arvore.Inserir(6, "no 6");
		// arvore.Inserir(450, "no 450");
		
        Problema();
        // grafo.imprimeArvore();
        // System.out.println(grafo.getVertice("Arad").getIncidentes());
        // System.out.println(grafo.getVertice("Arad").getFilhos());
        // System.out.println(grafo.getVertice("Arad").getVizinhos());
        // System.out.println(grafo.getArestas());
        // System.out.println(grafo.buscaEmProfundidade("Arad", "Bucareste"));
	}
	
    public static Grafo Problema() {
        // Vertices
        Vertice arad = new Vertice("Arad");
        Vertice timisoara = new Vertice("Timisoara");
        Vertice sibiu = new Vertice("Sibiu");
        Vertice zerind = new Vertice("Zerind");
        Vertice lugoj = new Vertice("Lugoj");
        Vertice mehadia = new Vertice("Mehadia");
        Vertice drobeta = new Vertice("Drobeta");
        Vertice craiova = new Vertice("Craiova");
        Vertice fagaras = new Vertice("Fagaras");
        Vertice rimnicu = new Vertice("Rimnicu Vilcea");
        Vertice pitesti = new Vertice("Pitesti");
        Vertice buscareste = new Vertice("Bucareste");
        Vertice giurgiu = new Vertice("Giurgiu");
        Vertice uziceni = new Vertice("Urziceni");
        Vertice hirsova = new Vertice("Hirsova");
        Vertice eforie = new Vertice("Eforie");
        Vertice vaslui = new Vertice("Vaslui");
        Vertice iasi = new Vertice("Iasi");
        Vertice neamt = new Vertice("Neamt");
        Vertice oradea = new Vertice("Oradea");

        // Arestas
        // arad -> Sibiu
        Aresta a1 = new Aresta(140 , arad, sibiu);
        // arad -> timisoara
        Aresta a2 = new Aresta(118 , arad, timisoara);
        // arad -> Zerind
        Aresta a3 = new Aresta(75 , arad, zerind);
        // timisoara -> lugoj
        Aresta a4 = new Aresta(111 , timisoara, lugoj);
        // Logoj -> Mehadia
        Aresta a5 = new Aresta(70 , lugoj, mehadia);
        // Mehadia -> Drobeta
        Aresta a6 = new Aresta(75 , mehadia, drobeta);
        // Drobeta -> Craiova   
        Aresta a7 = new Aresta(120 , drobeta, craiova);
        // Zerind -> Oradea
        Aresta a8 = new Aresta(71 , zerind, oradea);
        // Oradea -> Sibiu
        Aresta a9 = new Aresta(151 , oradea, sibiu);
        // Rimnicu Vilcea -> Pitesti
        Aresta a10 = new Aresta(97 , rimnicu, pitesti);
        // Rimnicu Vilcea -> Craiova
        Aresta a11 = new Aresta(146 , rimnicu, craiova);
        //Craiova -> Pitesti 
        Aresta a12 = new Aresta(138 , craiova, pitesti);
        // Sibiu -> Fagaras
        Aresta a13 = new Aresta(99 , sibiu, fagaras);
        // Sibiu -> Rimnicu Vilcea
        Aresta a14 = new Aresta(80 , sibiu, rimnicu);
        // Fagaras - > Bucareste
        Aresta a15 = new Aresta(211 , fagaras, buscareste);
        // Pitesti -> Bucareste
        Aresta a16 = new Aresta(101 , pitesti, buscareste);
        // Bucareste -> Giurgiu
        Aresta a17 = new Aresta(90 , buscareste, giurgiu);
        // Bucareste -> Urzeceni 
        Aresta a18 = new Aresta(85 , buscareste, uziceni);
        // Urzeceni -> Hirsova
        Aresta a19 = new Aresta(98 , uziceni, hirsova);
        // Hirsova -> Eforie
        Aresta a20 = new Aresta(86 , hirsova, eforie);
        // Urzeceni -> Vaslui
        Aresta a21 = new Aresta(142 , uziceni, vaslui);
        // Vaslui -> Iasi
        Aresta a22 = new Aresta(92 , vaslui, iasi);
        // Iasi -> Neamt
        Aresta a23 = new Aresta(87 , iasi, neamt);

        
        ArrayList <Vertice> vertices = new ArrayList<Vertice>();
        vertices.add(arad);
        vertices.add(timisoara);
        vertices.add(sibiu);
        vertices.add(zerind);
        vertices.add(lugoj);
        vertices.add(mehadia);
        vertices.add(drobeta);
        vertices.add(craiova);
        vertices.add(fagaras);
        vertices.add(rimnicu);
        vertices.add(pitesti);
        vertices.add(buscareste);
        vertices.add(giurgiu);
        vertices.add(uziceni);
        vertices.add(hirsova);
        vertices.add(eforie);
        vertices.add(vaslui);
        vertices.add(iasi);
        vertices.add(neamt);
        vertices.add(oradea);

        ArrayList <Aresta> arestas = new ArrayList<>();
        arestas.add(a1);
        arestas.add(a2);
        arestas.add(a3);
        arestas.add(a4);
        arestas.add(a5);
        arestas.add(a6);
        arestas.add(a7);
        arestas.add(a8);
        arestas.add(a9);
        arestas.add(a10);
        arestas.add(a11);
        arestas.add(a12);
        arestas.add(a13);
        arestas.add(a14);
        arestas.add(a15);
        arestas.add(a16);
        arestas.add(a17);
        arestas.add(a18);
        arestas.add(a19);
        arestas.add(a20);
        arestas.add(a21);
        arestas.add(a22);
        arestas.add(a23);

        // System.out.println(arestas);
        Grafo g1 = new Grafo();
        g1.setArestas(arestas);
        // g1.setVertices(vertices);
                // System.out.println(grafo.getArestas());
        // System.out.println(g1.posicaoVertice("Arad"));
        // System.out.println(g1.posicaoVertice("Sibiu"));
        // System.out.println(g1.posicaoVertice("Fagaras"));
        System.out.println();
        System.out.println("busca em profundidade");
        System.out.println(g1.buscaEmProfundidade("Arad", "Bucareste"));
        System.out.println();
        System.out.println("busca em largura");
        System.out.println(g1.buscaEmLargura("Arad", "Bucareste"));
        return g1;
    }


}
