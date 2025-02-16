Gestion des erreurs entre Spring boot 2 et Spring boot 3 (Problem Detail)


Spring boot 2 = reponse simple (texte), non precise, non standardisee et donc personnalisable ;  procedure verbeuse ; non respect de RFC7807.
  Exemple (contextuel ou non) : "ERROR 404"
                                "Not found"
                                

Spring boot 3 (Problem Detail) = reponse standardisee et normee RFC7807, precis et detaille ; non verbeux ; renvoie un JSON.
  Exemple (contextuel) :  "timestamp": "2025-02-16T09:20:33.788+00:00",
                          "status": 404,
                          "error": "Not Found",
                          "message": "Book not found with id 344",
                          "path": "/book/api/book/344"


Source : https://www.rfc-editor.org/rfc/rfc7807.


Eddvance
