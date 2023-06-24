Algoritmo "Lucro"
Var
   lucro : inteiro
   produto, margem, total : real
   i : caractere
Inicio
      faca
          escrevaL ("Digite o valor do produto")
          leia (produto)
          escrevaL ("Digite a margem de lucro")
          leia (margem)
          margem <- produto * margem  /100
          total <- margem + produto
          escrevaL ("Você deseja continuar? [S/N]")
          leia (i)
      enquanto i == "s"
Fimalgoritmo